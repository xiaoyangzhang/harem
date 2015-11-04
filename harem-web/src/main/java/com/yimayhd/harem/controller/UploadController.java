package com.yimayhd.harem.controller;

import com.taobao.common.tfs.TfsManager;
import com.yimayhd.harem.base.BaseController;
import com.yimayhd.harem.base.ResponseVo;
import com.yimayhd.harem.util.WebConfigUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Administrator on 2015/10/23.
 */
@Controller
@RequestMapping("/upload")
public class UploadController extends BaseController {
    private TfsManager tfsManager;

    public TfsManager getTfsManager() {
        return tfsManager;
    }
    @Autowired
    public void setTfsManager(TfsManager tfsManager) {
        this.tfsManager = tfsManager;
    }

    /**
     * 上传页面
     * @return 上传页面
     * @throws Exception
     */
    @RequestMapping(value = "/toUpload", method = RequestMethod.GET)
    public
    String toUpload(HttpServletRequest request) throws Exception {
        request.setAttribute("hello", new Date());
        return "/demo/upload";
    }

    /**
     * 上传文件
     * @return 上传文件
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/file", method = RequestMethod.POST)
    public ResponseVo uploadFile(@RequestParam(value = "file", required = false)MultipartFile titleFile) throws Exception {
        //保存文件到tfs
        String titleFileName=tfsManager.saveFile(titleFile.getBytes(), null, null);
        //返回文件名
        System.out.println(titleFileName);
        System.out.println(new ResponseVo(titleFileName));
        return new ResponseVo(titleFileName);
    }
    /**
     * 上传文件
     * @return 上传文件
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/ckeditor", method = RequestMethod.POST)
    public ResponseVo uploadCKEditor(@RequestParam(value = "detail", required = false)String ckeditor) throws Exception {
        //保存文件到tfs
        String encodeHtml = "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />";
        String detailTfs = tfsManager.saveFile((encodeHtml+ckeditor).getBytes("utf-8"), null, "html");
        //返回文件名
        return new ResponseVo(detailTfs);
    }

    /**
     * 读取配置文件
     * @return test
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/property", method = RequestMethod.GET)
    public ResponseVo uploadCKEditor(HttpServletRequest request) throws Exception {
        return new ResponseVo(WebConfigUtil.getTfsRootPath(request)+WebConfigUtil.getPropertyByKey("tfs.groupName",request));
    }
}
