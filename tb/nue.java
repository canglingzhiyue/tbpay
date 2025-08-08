package tb;

import android.support.v4.util.Pair;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.search.common.util.r;
import com.taobao.tao.Globals;
import com.ut.device.UTDevice;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class nue implements iua {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static nue f31768a;
    private Map<String, Pair<String, String>> b;

    public static /* synthetic */ void a(nue nueVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e9aa9a", new Object[]{nueVar});
        } else {
            nueVar.c();
        }
    }

    static {
        kge.a(-2050683915);
        kge.a(2147285705);
        f31768a = new nue();
    }

    public static nue a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nue) ipChange.ipc$dispatch("f086960", new Object[0]) : f31768a;
    }

    private nue() {
    }

    @Override // tb.iua
    public synchronized void a(TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d458d5e2", new Object[]{this, templateBean});
            return;
        }
        b();
        String str = templateBean.url;
        Pair<String, String> pair = this.b.get(str);
        if (pair == null) {
            return;
        }
        templateBean.url = pair.first;
        templateBean.md5 = pair.second;
        k.e("SearchTemplateRewrite", "REWRITE HIT: url" + str + " -> toUrl: " + pair.first);
    }

    public synchronized String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        b();
        Pair<String, String> pair = this.b.get(str);
        if (pair == null) {
            return null;
        }
        k.e("SearchTemplateRewrite", "REWRITE HIT: url" + str + " -> toUrl: " + pair.first);
        return pair.first;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b != null) {
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"search_template_rewrite"}, new d() { // from class: tb.nue.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    } else {
                        nue.a(nue.this);
                    }
                }
            }, true);
            c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            b(r.a("search_template_rewrite", "search_template_rewrite", "[{\"url\":\"https://g.alicdn.com/asr-pages/cloudtheme-recommend-young-crowd/0.0.3/cloudtheme-recommend-young-crowd.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/asr-pages/cloudtheme-recommend-young-crowd/0.0.7/cloudtheme-recommend-young-crowd.mus.wlm.js\",\"md5\":\"fb9bb5074741cfc6346805b77a3521f1\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/cloud_topic_checklist_muise_item/0.0.8/cloud_topic_checklist_muise_item.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/cloud_topic_checklist_muise_item/0.0.10/cloud_topic_checklist_muise_item.mus.wlm.js\",\"md5\":\"091fe1b36cd00a1983005de3e16b6581\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/cloud_topic_checklist_border_line/0.0.7/cloud_topic_checklist_border_line.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/cloud_topic_checklist_border_line/0.0.9/cloud_topic_checklist_border_line.mus.wlm.js\",\"md5\":\"086d5e87910f55e2d2cc969b2d758e2f\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/cloud_topic_clothes_header/0.0.6/cloud_topic_clothes_header.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/cloud_topic_clothes_header/0.0.7/cloud_topic_clothes_header.mus.wlm.js\",\"md5\":\"b5e678357a7b9346b1f35e9cbb9d9c96\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/muise_xsearch_common_header/0.0.3/muise_xsearch_common_header.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/muise_xsearch_common_header/0.0.7/muise_xsearch_common_header.mus.wlm.js\",\"md5\":\"ad78b82b6a9e4b5f1800a6808aaa7cc0\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/cloud_topic_common_muise_error/0.0.3/cloud_topic_common_muise_error.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/cloud_topic_common_muise_error/0.0.5/cloud_topic_common_muise_error.mus.wlm.js\",\"md5\":\"526287e8a9dcca5b2cded43b819423a9\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/cloud_topic_muise_item/0.1.10/cloud_topic_muise_item.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/cloud_topic_muise_item/0.1.23/cloud_topic_muise_item.mus.wlm.js\",\"md5\":\"0efb1a28ab4c8827e70c827ff8196caa\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/plt_history_time_title/0.0.4/plt_history_time_title.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/plt_history_time_title/0.0.5/plt_history_time_title.mus.wlm.js\",\"md5\":\"95d36ab76127d3cc8c0487d3328b8761\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/plt_history_row_image/0.0.5/plt_history_row_image.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/plt_history_row_image/0.0.6/plt_history_row_image.mus.wlm.js\",\"md5\":\"0c521084b94b2eabb25c312c71b261be\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/plt_history_temp_top_tips/0.0.2/plt_history_temp_top_tips.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/plt_history_temp_top_tips/0.0.3/plt_history_temp_top_tips.mus.wlm.js\",\"md5\":\"b5d8d9efbc044d23cb7398424123f1b4\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/common_text_with_icons_widget/0.1.1/common_text_with_icons_widget.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/common_text_with_icons_widget/0.1.2/common_text_with_icons_widget.mus.wlm.js\",\"md5\":\"1236788e39b002e0b9f2762adb30401d\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/common_error_widget/0.0.1/common_error_widget.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/common_error_widget/0.0.4/common_error_widget.mus.wlm.js\",\"md5\":\"befcb8c2284890a749d0c837340fdbb6\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/search_door_capsule_widget/0.1.13/search_door_capsule_widget.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/search_door_capsule_widget/0.1.14/search_door_capsule_widget.mus.wlm.js\",\"md5\":\"da9c8340fe4a45b00335758df4a7731f\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/common_error_widget/0.0.3/common_error_widget.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/common_error_widget/0.0.5/common_error_widget.mus.wlm.js\",\"md5\":\"a742cafb925d4315313436c18acdb3c3\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/elder_interactive_search_widget/0.0.2/elder_interactive_search_widget.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/elder_interactive_search_widget/0.0.3/elder_interactive_search_widget.mus.wlm.js\",\"md5\":\"380c8d9320165a8fe798fce627a445cc\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/koubei-industry/tb_search_item_industry_video_type/0.0.4/tb_search_item_industry_video_type.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/koubei-industry/tb_search_item_industry_video_type/0.0.5/tb_search_item_industry_video_type.mus.wlm.js\",\"md5\":\"a3c103e7415ff5bc35584deeaa735763\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/plt_floor_drug_qa_card/0.0.1/plt_floor_drug_qa_card.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/plt_floor_drug_qa_card/0.0.2/plt_floor_drug_qa_card.mus.wlm.js\",\"md5\":\"9cde1430e87fbe65e46fdadb445fee46\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/city_sale_tab_item_to_shop/0.0.1/city_sale_tab_item_to_shop.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/city_sale_tab_item_to_shop/0.0.2/city_sale_tab_item_to_shop.mus.wlm.js\",\"md5\":\"2236721d3ef09c0e5b92b77a4242943b\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/shengxian_content/0.0.1/shengxian_content.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/shengxian_content/0.0.2/shengxian_content.mus.wlm.js\",\"md5\":\"d5c5b8f621e6dacca80d89185892c0e9\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/tcg_local_2022_home_decoration_card/0.0.5/tcg_local_2022_home_decoration_card.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/tcg_local_2022_home_decoration_card/0.0.6/tcg_local_2022_home_decoration_card.mus.wlm.js\",\"md5\":\"3d30956f23d68ebde121114a52587d86\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/new_calendar_undertake/0.0.6/new_calendar_undertake.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/new_calendar_undertake/0.0.7/new_calendar_undertake.mus.wlm.js\",\"md5\":\"fa33d8f9a7aef89fbfeb33f8c638396c\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/search_cloth_collocation_scene_words_card/0.0.18/search_cloth_collocation_scene_words_card.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/search_cloth_collocation_scene_words_card/0.0.19/search_cloth_collocation_scene_words_card.mus.wlm.js\",\"md5\":\"5c82922308a7325c74efb3a9f5fdd993\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/home-decorate-wf/0.0.6/home-decorate-wf.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/home-decorate-wf/0.0.7/home-decorate-wf.mus.wlm.js\",\"md5\":\"1c1345b19170f5d0651e997d17175ed8\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/shiling_title/0.0.1/shiling_title.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/shiling_title/0.0.2/shiling_title.mus.wlm.js\",\"md5\":\"a9e78b5e268abf1791f9b975ca11a04b\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/newtab_calendar_date/0.0.1/newtab_calendar_date.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/newtab_calendar_date/0.0.2/newtab_calendar_date.mus.wlm.js\",\"md5\":\"82bffffba9808e037e905653af7bb191\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/newtab_calendar_scrollbar/0.0.2/newtab_calendar_scrollbar.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/newtab_calendar_scrollbar/0.0.6/newtab_calendar_scrollbar.mus.wlm.js\",\"md5\":\"7535bff8c83f6d6968298de5349f073d\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/cloud_topic_clothes_goods/0.0.10/cloud_topic_clothes_goods.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/cloud_topic_clothes_goods/0.0.11/cloud_topic_clothes_goods.mus.wlm.js\",\"md5\":\"b1a68b2e86dd6871be7f29b9678ab1d5\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/cate_item/0.0.6/cate_item.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/cate_item/0.0.7/cate_item.mus.wlm.js\",\"md5\":\"e251a0321a874344f0e6b662c830a422\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/elder_search_onesearch_mods_widget/0.0.4/elder_search_onesearch_mods_widget.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/elder_search_onesearch_mods_widget/0.0.5/elder_search_onesearch_mods_widget.mus.wlm.js\",\"md5\":\"ee2ca4d679fa01db731906fce9a80abd\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/plain_text_tab/0.1.0/plain_text_tab.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/plain_text_tab/0.1.1/plain_text_tab.mus.wlm.js\",\"md5\":\"991a1af123f5da7dffdfc9d54b72b0e2\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/new_search_2021_no_result_card/0.0.1/new_search_2021_no_result_card.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/new_search_2021_no_result_card/0.0.2/new_search_2021_no_result_card.mus.wlm.js\",\"md5\":\"1a82eb5a38e76b3c7449d278746321e9\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/tmall_luxury_muise_card/0.0.4/tmall_luxury_muise_card.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/tmall_luxury_muise_card/0.0.5/tmall_luxury_muise_card.mus.wlm.js\",\"md5\":\"8d1830e15228bde90112ca0fe5aa59a3\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/asr-pages/season_fresh_page/0.0.1/season_fresh_page.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/asr-pages/season_fresh_page/0.0.2/season_fresh_page.mus.wlm.js\",\"md5\":\"746959db3b5f68fbf7d81109605e92d0\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/asr-pages/plt_history_record_page/0.0.4/plt_history_record_page.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/asr-pages/plt_history_record_page/0.1.2/plt_history_record_page.mus.wlm.js\",\"md5\":\"1291355cee7eb5916aae8874577708af\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/chaopin_super_brand_day/1.0.6/chaopin_super_brand_day.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/chaopin_super_brand_day/1.0.7/chaopin_super_brand_day.mus.wlm.js\",\"md5\":\"8a3d6355a1a7d4f8ddd36ca7ec7f2729\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/similar_sticky_tab_header/0.0.3/similar_sticky_tab_header.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/similar_sticky_tab_header/0.0.4/similar_sticky_tab_header.mus.wlm.js\",\"md5\":\"ab0c04da63392a38fefc6c72ded90db5\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/asr-pages/scanqrcode_page/0.0.8/scanqrcode_page.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/asr-pages/scanqrcode_page/0.0.10/scanqrcode_page.mus.wlm.js\",\"md5\":\"7b5becb272a12b230ec36f01f5b3db1a\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/newsearch_localization_address_filter/0.0.8/newsearch_localization_address_filter.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/newsearch_localization_address_filter/0.0.9/newsearch_localization_address_filter.mus.wlm.js\",\"md5\":\"aca290ef1f4afe03a5795525b5178633\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/xsearch_cate_recommend_header/0.0.2/xsearch_cate_recommend_header.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/xsearch_cate_recommend_header/0.0.4/xsearch_cate_recommend_header.mus.wlm.js\",\"md5\":\"56e97bbefe2c8fb081feb9f128dbaa9f\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/muise_xsearch_common_header/0.0.4/muise_xsearch_common_header.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/muise_xsearch_common_header/0.0.7/muise_xsearch_common_header.mus.wlm.js\",\"md5\":\"ad78b82b6a9e4b5f1800a6808aaa7cc0\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/similar_gold_entrance/0.1.0/similar_gold_entrance.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/similar_gold_entrance/0.1.1/similar_gold_entrance.mus.wlm.js\",\"md5\":\"c911e3d272ff859c55358ee2c0a08b77\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/brand_screening_module/0.0.1/brand_screening_module.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/brand_screening_module/0.0.2/brand_screening_module.mus.wlm.js\",\"md5\":\"e74f6f5423c2436373601d739aa23445\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/shopwindow_video_2021_widget/0.0.6/shopwindow_video_2021_widget.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/shopwindow_video_2021_widget/0.0.9/shopwindow_video_2021_widget.mus.wlm.js\",\"md5\":\"a768fa05a544fb01839fa5706628323c\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/newsearch_item_topbar/0.0.15/newsearch_item_topbar.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/newsearch_item_topbar/0.0.16/newsearch_item_topbar.mus.wlm.js\",\"md5\":\"ef44e37963444f08899af2c50edfc3db\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/cloud_topic_muise_item/0.1.22/cloud_topic_muise_item.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/cloud_topic_muise_item/0.1.23/cloud_topic_muise_item.mus.wlm.js\",\"md5\":\"0efb1a28ab4c8827e70c827ff8196caa\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/search_new_calendar/0.0.5/search_new_calendar.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/search_new_calendar/0.0.7/search_new_calendar.mus.wlm.js\",\"md5\":\"a4afba635ac9cf1dd797ec40512e958c\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/tbs_widget_m1/0.0.88/tbs_widget_m1.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/tbs_widget_m1/0.0.89/tbs_widget_m1.mus.wlm.js\",\"md5\":\"d70e583bc50895a8b13dfd97e9e5c619\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/new_search_2021_less_result_card/0.0.1/new_search_2021_less_result_card.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/new_search_2021_less_result_card/0.0.2/new_search_2021_less_result_card.mus.wlm.js\",\"md5\":\"2db97e8e0d43e4aeacd93001a2f602cc\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/new_search_2021_product_prompt_card/0.0.1/new_search_2021_product_prompt_card.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/new_search_2021_product_prompt_card/0.0.2/new_search_2021_product_prompt_card.mus.wlm.js\",\"md5\":\"3438cd54bfd2fa8d3f112aa485175898\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/search_coupon_widget/0.1.2/search_coupon_widget.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/search_coupon_widget/0.1.4/search_coupon_widget.mus.wlm.js\",\"md5\":\"dcd724efa148a718c3268233e6960f60\",\"ab\":\"100\"},{\"url\":\"https://g.alicdn.com/tb-webb-widget/preposition_filter_classify_with_pic_new/0.0.4/preposition_filter_classify_with_pic_new.mus.wlm\",\"newUrl\":\"https://g.alicdn.com/tb-webb-widget/preposition_filter_classify_with_pic_new/0.0.7/preposition_filter_classify_with_pic_new.mus.wlm.js\",\"md5\":\"9bd00276d64fa97a71e8084825f3355f\",\"ab\":\"100\"},{\"url\":\"https://mo.m.taobao.com/search_rec/plt_history_record_page\",\"newUrl\":\"https://g.alicdn.com/asr-pages/plt_history_record_page/0.1.2/plt_history_record_page.mus.wlm.js\",\"md5\":\"1291355cee7eb5916aae8874577708af\",\"ab\":\"100\"}]"));
        }
    }

    private synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        this.b = new HashMap();
        if (StringUtils.isEmpty(str)) {
            k.e("SearchTemplateRewrite", "CONFIG_EMPTY");
            return;
        }
        int c = c(UTDevice.getUtdid(Globals.getApplication()));
        JSONArray parseArray = JSONObject.parseArray(str);
        for (int i = 0; i < parseArray.size(); i++) {
            JSONObject jSONObject = parseArray.getJSONObject(i);
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("newUrl");
            String string3 = jSONObject.getString("md5");
            String string4 = jSONObject.getString("ab");
            if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2) && !StringUtils.isEmpty(string3) && !StringUtils.isEmpty(string4)) {
                if (Integer.parseInt(string4) > c) {
                    k.e("SearchTemplateRewrite", "REWRITE: " + jSONObject.toJSONString());
                    this.b.put(string, new Pair<>(string2, string3));
                } else {
                    k.e("SearchTemplateRewrite", "NOT_HIT: " + string);
                }
            }
        }
    }

    private static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{str})).intValue();
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            byte[] bArr = new byte[8];
            for (int i = 0; i < 8; i++) {
                bArr[i] = digest[i];
            }
            return new BigInteger(1, bArr).mod(new BigInteger("100")).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
