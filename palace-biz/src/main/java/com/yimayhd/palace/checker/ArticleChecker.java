package com.yimayhd.palace.checker;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yimayhd.palace.checker.result.CheckResult;
import com.yimayhd.palace.model.ArticleVO;
import com.yimayhd.resourcecenter.model.enums.ArticleItemSubType;

/**
 * 文章checker
 * 
 * @author xiemingna
 *
 */
public class ArticleChecker {
	private static final Logger log = LoggerFactory.getLogger(ArticleChecker.class);

	public static CheckResult checkArticleVO(ArticleVO articleVO) {
		if (StringUtils.isBlank(articleVO.getTitle())) {
			return CheckResult.error("标题不能为空");
		}
		if (StringUtils.isBlank(articleVO.getFrontcover())) {
			return CheckResult.error("封面不能为空");
		}
		if (ArticleItemSubType.get(articleVO.getType()) == null) {
			return CheckResult.error("不支持的子项类型");
		}
		if (articleVO.getArticleItems() == null) {
			return CheckResult.error("图文不能为空");
		}
		return CheckResult.success();
	}

}
