package com.taobao.android.litecreator.base.data;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.litecreator.sdk.editor.data.MusicInfo;
import com.taobao.taopai.material.bean.MaterialDetail;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class QuickPublishModel implements Serializable {
    public JSONObject extendInfo;
    public PreviewElements previewElements;
    public JSONObject publishConfig;
    public PublishData publishData;
    public RenderData renderData;

    /* loaded from: classes5.dex */
    public static class OrderItem implements Serializable {
        public String picUrl;
        public String price;
        public String title;

        static {
            kge.a(921351001);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class PreviewElements implements Serializable {
        public JSONObject editMedia;
        public boolean goodsListVisible = false;
        public int layoutType = 0;
        public JSONArray recommendMedias;
        public JSONArray recommendTemplates;
        public JSONArray recommendTitles;

        static {
            kge.a(-1000992073);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class PublishData implements Serializable {
        public List<OrderItem> orderItems;
        public String templateId;
        public TextTpl textTpl;
        public JSONObject topic;

        static {
            kge.a(-1303978191);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class RenderData implements Serializable {
        public JSONArray bindMedias;
        public JSONObject bindTexts;
        public int minMediasCount;
        public MusicInfo musicInfo;
        public MaterialDetail templateDetail;

        static {
            kge.a(-1045376632);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class TextTpl implements Serializable {
        public String literalText;
        public String rawText;
        public JSONArray textMetas;

        static {
            kge.a(1434911451);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1299259036);
        kge.a(1028243835);
    }
}
