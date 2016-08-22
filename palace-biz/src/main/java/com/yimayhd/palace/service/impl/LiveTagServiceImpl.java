package com.yimayhd.palace.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yimayhd.commentcenter.client.domain.ComTagDO;
import com.yimayhd.commentcenter.client.dto.TagInfoDTO;
import com.yimayhd.commentcenter.client.enums.TagType;
import com.yimayhd.palace.base.BaseException;
import com.yimayhd.palace.base.PageVO;
import com.yimayhd.palace.checker.TagChecker;
import com.yimayhd.palace.checker.result.CheckResult;
import com.yimayhd.palace.model.LiveTagVO;
import com.yimayhd.palace.repo.TagRepo;
import com.yimayhd.palace.service.LiveTagService;

public class LiveTagServiceImpl implements LiveTagService {
	@Autowired
	private TagRepo tagRepo;

	@Override
	public PageVO<ComTagDO> pageQueryLiveTag(TagInfoDTO tagInfoDTO) {
		tagInfoDTO.setOutType(TagType.LIVESUPTAG.getType());
		return tagRepo.pageQueryTag(tagInfoDTO);
	}

	@Override
	public ComTagDO getLveTagById(long id) {
		return tagRepo.getTagById(id);
	}

	@Override
	public void disableLiveTagById(long id) {
		tagRepo.updateTagStateById(id, TagRepo.STATUS_DISABLE);
	}

	@Override
	public void enableLiveTagById(long id) {
		tagRepo.updateTagStateById(id, TagRepo.STATUS_ENABLE);
	}

	@Override
	public void disableLiveTagByIdList(List<Long> idList) {
		tagRepo.updateTagStateByIdList(idList, TagRepo.STATUS_DISABLE);
	}

	@Override
	public void enableLiveTagByIdList(List<Long> idList) {
		tagRepo.updateTagStateByIdList(idList, TagRepo.STATUS_ENABLE);
	}

	@Override
	public void save(LiveTagVO tag) {
		if (tag.getId() > 0) {
			CheckResult checkResult = TagChecker.checkLiveTagVOForUpdate(tag);
			if(checkResult.isSuccess()) {
				tagRepo.updateTag(tag.toTagInfo());
			} else {
				throw new BaseException(checkResult.getMsg());
			}
		} else {
			CheckResult checkResult = TagChecker.checkLiveTagVOForSave(tag);
			if(checkResult.isSuccess()) {
				tagRepo.saveTag(tag.toTagInfo());
			} else {
				throw new BaseException(checkResult.getMsg());
			}
		}
	}
}
