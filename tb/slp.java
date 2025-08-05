package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.remote.newmodel.a;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;

/* loaded from: classes5.dex */
public class slp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(339131995);
    }

    public static boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue();
        }
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams == null) {
            return true;
        }
        if (b()) {
            return a(sessionParams.b, sessionParams.c);
        }
        return a(sessionParams.c);
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableNewRecommendBlackWay", true);
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        String a2 = oeb.a("TBVSNewRecommend.newMtopBlackTypeList", "cainixihuansy_ng,buyershow_guangguang,shop_erlou,tbsearch_maintab,tbzb_sy_zbjj,myorder,shop_single,cainixihuansy,syguanggao,shopShowreel,tmallyutry_content,publish,vd_std_a,utrymyvideo,after_sale,ltwo_yhh,vd_std_d,MYTB_mytaobao_20230313,tbsearch_contenttab,vd_std_f,vd_std_e,taobaochihuo_2022,tbsearch_experience,tbsearch_ippage,ifashion_ifashion_2023015,campus_rank,diantao_video_at_tao,inshop,alisec,gouhou_howto_video,tmallglobal,subscribe,vp2_collection,vd_std_b,mainpic_video,darenhomepage,guang,WEITAO,tbsearch_liulishi,myhome_2021,videoselfpage,pinpai2019,slide_author,subscribe_buyercomment,cainixihuan_gouhou,guangguang_cainixihuan,common_homepage,shop_zdbm,preview,interaction_ad,tbsearchcid,contentPlat,taobaolive,shop_erlou_collection,pool_preview,tbtt,shop_shipai,shop_hots,cdj,Kandian_tmallHaoFang_20230414,vdstda,mainpic_dynamic,contentgrass_shop,zhibohuichang,shop_column,tbsearch_experience,guangguang_homepage,guang_std_c,guang_std_b,guangguang_view_task,guangguang_topic,guangguang_super_topic,guang_std_d,guang_std_a,jyjchannel_tm_home_improvement_20221229");
        boolean b = b(str, a2);
        if (b) {
            spz.c("NewRecommendHelper", "enableRecommendMtopNew orange渠道匹配，isMatchType=" + b + "; " + a2);
            return false;
        }
        String a3 = oeb.a("ShortVideo.newMtopBlackSourceList", "guangguang_school");
        boolean b2 = b(str2, a3);
        if (b2) {
            spz.c("NewRecommendHelper", "enableRecommendMtopNew orange渠道匹配，isMatchSource=" + b2 + "; " + a3);
            return false;
        }
        spz.c("NewRecommendHelper", "enableRecommendMtopNew orange渠道匹配，未命中任何黑名单. blackTypeList=" + a2 + "; blackSourceList=" + a3);
        return true;
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        boolean b = b(str, oeb.a("ShortVideo.mixRecommendMtopChannel", "guangguang_pick"));
        spz.c("NewRecommendHelper", "enableRecommendMtopNew orange渠道匹配，isMatchSource=" + b);
        return b;
    }

    private static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (str == null || str2 == null || a.MATCH_IGNORE.equals(str) || "*".equals(str2)) {
            return true;
        }
        if ("-".equals(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (TextUtils.equals(str, str3)) {
                return true;
            }
        }
        return false;
    }
}
