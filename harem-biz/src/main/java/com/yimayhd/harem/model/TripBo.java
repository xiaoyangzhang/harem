package com.yimayhd.harem.model;

import java.io.Serializable;
import java.util.List;

import com.yimayhd.ic.client.model.domain.share_json.NeedKnow;


/** 
* @ClassName: TripBo 
* @Description: (出发地，目的地 bo对象) 
* @author create by yushengwei @ 2015年12月10日 下午8:01:53 
*/
public class TripBo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public long id; /** id */
	
	public String cityName; /**目的地名称 */
	public int cityCode; /** */
	public int cityLevel; /** 级别 省市区 */
	public int[] tag; /** 标签 */
	public String logoURL; /** 封面图 */
	public String coverURL; /** 目的地图 */
	public int type;/** 1出发地，2目的地*/
	public int status;
	public String scenicSubhead;//景点副标题
	public String hotelSubhead;//酒店副标题
	public String liveSubhead;//直播副标题
	
	
	//public List<NeedKnow> needKnowList; /** 概况 */
	//XXX:此处为了方便对应上页面的各个选项，不得已而为之。使用list<NeedKnow> 属性，页面无法识别，low，待后期有时间在调整。

		public NeedKnow gaikuang; /** 概况 */
	

		public NeedKnow minsu; /** 民俗 */
	

		public NeedKnow xiaofei; /** 消费 */
	

		public NeedKnow tieshi; /** 贴示 */
	
	//public List<AffiliateDetail> affiliateDetail;
	
	//---以下关联id，以数组方式存放-----------------------------------------------
	public int[] biMai;/** 必买推荐 */
	public int[] biQu;/** 必去景点*/
	public int[] jiuDian;/** 精选酒店*/
	public int[] zhiBo;/** 精选直播*/
	public int[] xianLu;/** 线路*/

	public List<NeedKnow> biMaiList;
	public List<NeedKnow> biQuList;
	public List<NeedKnow> jiuDianList;
	public List<NeedKnow> zhiBoList;
	public List<NeedKnow> xianLuList;
	
	public List<NeedKnow> tieshiList;
	public List<NeedKnow> xiaofeiList;
	public List<NeedKnow> minsuList;
	public List<NeedKnow> gaikuangList;

	
	
	public List<NeedKnow> getBiMaiList() {
		return biMaiList;
	}



	public void setBiMaiList(List<NeedKnow> biMaiList) {
		this.biMaiList = biMaiList;
	}



	public List<NeedKnow> getBiQuList() {
		return biQuList;
	}



	public void setBiQuList(List<NeedKnow> biQuList) {
		this.biQuList = biQuList;
	}



	public List<NeedKnow> getJiuDianList() {
		return jiuDianList;
	}



	public void setJiuDianList(List<NeedKnow> jiuDianList) {
		this.jiuDianList = jiuDianList;
	}



	public List<NeedKnow> getZhiBoList() {
		return zhiBoList;
	}



	public void setZhiBoList(List<NeedKnow> zhiBoList) {
		this.zhiBoList = zhiBoList;
	}



	public List<NeedKnow> getXianLuList() {
		return xianLuList;
	}



	public void setXianLuList(List<NeedKnow> xianLuList) {
		this.xianLuList = xianLuList;
	}



	public List<NeedKnow> getTieshiList() {
		return tieshiList;
	}



	public void setTieshiList(List<NeedKnow> tieshiList) {
		this.tieshiList = tieshiList;
	}



	public List<NeedKnow> getXiaofeiList() {
		return xiaofeiList;
	}



	public void setXiaofeiList(List<NeedKnow> xiaofeiList) {
		this.xiaofeiList = xiaofeiList;
	}



	public List<NeedKnow> getMinsuList() {
		return minsuList;
	}



	public void setMinsuList(List<NeedKnow> minsuList) {
		this.minsuList = minsuList;
	}



	public List<NeedKnow> getGaikuangList() {
		return gaikuangList;
	}



	public void setGaikuangList(List<NeedKnow> gaikuangList) {
		this.gaikuangList = gaikuangList;
	}



	public String getCityName() {
		return cityName;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public void setCityName(String cityName) {
		this.cityName = cityName;
	}



	public int getCityCode() {
		return cityCode;
	}



	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}



	public int getCityLevel() {
		return cityLevel;
	}



	public void setCityLevel(int cityLevel) {
		this.cityLevel = cityLevel;
	}



	public String getLogoURL() {
		return logoURL;
	}



	public void setLogoURL(String logoURL) {
		this.logoURL = logoURL;
	}



	public String getCoverURL() {
		return coverURL;
	}



	public void setCoverURL(String coverURL) {
		this.coverURL = coverURL;
	}



	public int[] getTag() {
		return tag;
	}



	public void setTag(int[] tag) {
		this.tag = tag;
	}
	
	public int getType() {
		return type;
	}



	public void setType(int type) {
		this.type = type;
	}
	


	public int[] getBiMai() {
		return biMai;
	}



	public void setBiMai(int[] biMai) {
		this.biMai = biMai;
	}



	public int[] getBiQu() {
		return biQu;
	}



	public void setBiQu(int[] biQu) {
		this.biQu = biQu;
	}



	public int[] getJiuDian() {
		return jiuDian;
	}



	public void setJiuDian(int[] jiuDian) {
		this.jiuDian = jiuDian;
	}



	public int[] getZhiBo() {
		return zhiBo;
	}



	public void setZhiBo(int[] zhiBo) {
		this.zhiBo = zhiBo;
	}



	public int[] getXianLu() {
		return xianLu;
	}



	public void setXianLu(int[] xianLu) {
		this.xianLu = xianLu;
	}



	/*public List<AffiliateDetail> getAffiliateDetail() {
		return affiliateDetail;
	}



	public void setAffiliateDetail(List<AffiliateDetail> affiliateDetail) {
		this.affiliateDetail = affiliateDetail;
	}
*/


	public NeedKnow getGaikuang() {
		return gaikuang;
	}



	public void setGaikuang(NeedKnow gaikuang) {
		this.gaikuang = gaikuang;
	}



	public NeedKnow getMinsu() {
		return minsu;
	}



	public void setMinsu(NeedKnow minsu) {
		this.minsu = minsu;
	}



	public NeedKnow getXiaofei() {
		return xiaofei;
	}



	public void setXiaofei(NeedKnow xiaofei) {
		this.xiaofei = xiaofei;
	}



	public NeedKnow getTieshi() {
		return tieshi;
	}



	public void setTieshi(NeedKnow tieshi) {
		this.tieshi = tieshi;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	public String getScenicSubhead() {
		return scenicSubhead;
	}



	public void setScenicSubhead(String scenicSubhead) {
		this.scenicSubhead = scenicSubhead;
	}



	public String getHotelSubhead() {
		return hotelSubhead;
	}



	public void setHotelSubhead(String hotelSubhead) {
		this.hotelSubhead = hotelSubhead;
	}



	public String getLiveSubhead() {
		return liveSubhead;
	}



	public void setLiveSubhead(String liveSubhead) {
		this.liveSubhead = liveSubhead;
	}
	
	


	/*public List<NeedKnow> getNeedKnowList() {
		return needKnowList;
	}



	public void setNeedKnowList(List<NeedKnow> needKnowList) {
		this.needKnowList = needKnowList;
	}
	 */
	
	

	
	
}
