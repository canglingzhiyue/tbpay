package com.taobao.umipublish.extension.preview;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class PreviewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_IMAGE = 0;
    public static final int TYPE_MIX = 2;
    public static final int TYPE_VIDEO = 1;

    /* renamed from: a  reason: collision with root package name */
    public String f23246a;
    public int b;
    public int c;
    public boolean d;
    public Music f;
    public List<Media> e = new ArrayList();
    public String g = com.alibaba.ability.localization.b.a(R.string.gg_pub_edit);

    /* loaded from: classes9.dex */
    public static class Media implements Serializable {
        public String coverUrl;
        public String draftId;
        public JSONObject originData;
        public String path;
        public String ratio;
        public ArrayList<Tag> tags = new ArrayList<>();
        public int type;

        static {
            kge.a(294270198);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes9.dex */
    public static class Music implements Serializable {
        public String name;
        public String path;

        static {
            kge.a(294761271);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes9.dex */
    public static class Tag implements Serializable {
        public String coverUrl;
        public String direction;
        public String itemId;
        public double posX;
        public double posY;
        public String tagName;

        static {
            kge.a(-1693540052);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(409245526);
    }

    public static PreviewModel b(String str, int i, JSONArray jSONArray, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewModel) ipChange.ipc$dispatch("5dd85e33", new Object[]{str, new Integer(i), jSONArray, new Boolean(z)});
        }
        PreviewModel previewModel = new PreviewModel();
        previewModel.c = 2;
        previewModel.b = i;
        previewModel.f23246a = str;
        previewModel.d = z;
        previewModel.e = a(jSONArray);
        return previewModel;
    }

    public static PreviewModel a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewModel) ipChange.ipc$dispatch("b4534973", new Object[]{str, str2});
        }
        PreviewModel previewModel = new PreviewModel();
        previewModel.e = new ArrayList();
        previewModel.c = 1;
        Media media = new Media();
        media.path = str;
        media.ratio = str2;
        previewModel.e.add(media);
        return previewModel;
    }

    private static List<Media> a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9355ab7", new Object[]{jSONArray});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.size() > 0) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string = jSONObject.getString("path");
                    String string2 = jSONObject.getString("draftId");
                    String string3 = jSONObject.getString("coverUrl");
                    int intValue = jSONObject.getIntValue("type");
                    String string4 = jSONObject.getString("ratio");
                    JSONArray jSONArray2 = jSONObject.getJSONArray("tags");
                    Media media = new Media();
                    media.originData = jSONObject;
                    media.path = string;
                    media.coverUrl = string3;
                    media.draftId = string2;
                    media.type = intValue;
                    media.ratio = string4;
                    if (jSONArray2 != null) {
                        media.tags = new ArrayList<>();
                        int size2 = jSONArray2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            media.tags.add((Tag) JSON.toJavaObject(jSONArray2.getJSONObject(i2), Tag.class));
                        }
                    }
                    arrayList.add(media);
                }
            }
        }
        return arrayList;
    }

    public static PreviewModel a(String str, int i, JSONArray jSONArray, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewModel) ipChange.ipc$dispatch("1d5d4894", new Object[]{str, new Integer(i), jSONArray, new Boolean(z)});
        }
        PreviewModel previewModel = new PreviewModel();
        previewModel.b = i;
        previewModel.f23246a = str;
        previewModel.d = z;
        previewModel.c = 0;
        previewModel.e = a(jSONArray);
        return previewModel;
    }
}
