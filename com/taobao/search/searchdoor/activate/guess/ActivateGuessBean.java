package com.taobao.search.searchdoor.activate.guess;

import com.alibaba.fastjson.annotation.JSONField;
import com.etao.feimagesearch.model.d;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import java.io.Serializable;
import tb.kge;
import tb.nog;

/* loaded from: classes7.dex */
public class ActivateGuessBean implements Serializable {
    @JSONField(name = "cateid")
    public String cateid;
    @JSONField(name = nog.PRD_P4P_URL)
    public String clickUrl;
    @JSONField(name = "displaytype")
    public String displaytype;
    @JSONField(name = "noMergeRecallType")
    public String noMergeRecallType;
    @JSONField(name = d.KEY_PIC_URL)
    public String picurl;
    @JSONField(name = "preIconInfo")
    public PreIconInfo preIconInfo;
    @JSONField(name = "rawRecQuery")
    public String rawRecQuery;
    @JSONField(name = "recallType")
    public String recallType;
    @JSONField(name = "searchparams")
    public String searchparams;
    @JSONField(name = "searchtext")
    public String searchtext;
    @JSONField(name = "showtext")
    public String showtext;
    @JSONField(name = "subtype")
    public String subtype;
    @JSONField(name = "topcateid")
    public String topcateid;
    @JSONField(name = JarvisConstant.KEY_JARVIS_TRIGGER)
    public String trigger;

    /* loaded from: classes7.dex */
    public static class PreIconInfo {
        @JSONField(name = "height")
        public String height;
        @JSONField(name = "url")
        public String url;
        @JSONField(name = "width")
        public String width;

        static {
            kge.a(-2008510357);
        }
    }

    static {
        kge.a(-680869339);
        kge.a(1028243835);
    }
}
