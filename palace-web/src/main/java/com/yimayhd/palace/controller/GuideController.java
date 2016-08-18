package com.yimayhd.palace.controller;

import com.yimayhd.palace.model.guide.GuideListQuery;
import com.yimayhd.palace.model.guide.GuideVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 导览
 * Created by xushubing on 2016/8/18.
 */
@Controller
@RequestMapping("/jiuniu/guideManage")
public class GuideController {
    /**
     * 导览列表  分页
     *
     * @param model
     * @param guideListQuery
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/list")
    public String list(Model model, GuideListQuery guideListQuery) throws Exception {
        return null;
    }

    /**
     * 添加导览跳转
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/toAdd")
    public String toAdd() throws Exception {
        return null;
    }

    /**
     * 编辑导览跳转
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/toEdit")
    public String toEdit() throws Exception {
        return null;
    }

    /**
     * 添加导览
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/addGuide", method = RequestMethod.POST)
    public String addGuide(Model model, GuideVO guideVO) throws Exception {
        return null;
    }

    /**
     * 修改导览
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/editGuide", method = RequestMethod.POST)
    public String editGuide(Model model, GuideVO guideVO) throws Exception {
        return null;
    }

    /**
     * 设置权重
     *
     * @param model
     * @param guideVO
     * @return
     * @throws Exception
     */

    @RequestMapping(value = "/setWeight", method = RequestMethod.POST)
    public String setWeight(Model model, GuideVO guideVO) throws Exception {
        return null;
    }

    /**
     * 上架
     *
     * @param model
     * @param guideId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/status/up")
    public String upStatus(Model model, long guideId) throws Exception {
        return null;
    }

    /**
     * 下架
     *
     * @param model
     * @param guideId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/status/down")
    public String downStatus(Model model, long guideId) throws Exception {
        return null;
    }
}
