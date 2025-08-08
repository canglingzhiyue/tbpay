package com.taobao.android.layoutmanager.module;

import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.weex.common.Constants;
import tb.kge;
import tb.oec;
import tb.ohd;

/* loaded from: classes5.dex */
public class ImagePreloadModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-293087010);
        kge.a(-818961104);
    }

    public static void preload(g.c cVar) {
        String str;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e2ac6f", new Object[]{cVar});
        } else if (cVar.b instanceof JSONObject) {
            oec.a(((JSONObject) cVar.b).get("bizname"), (String) null);
            JSONArray a2 = oec.a(((JSONObject) cVar.b).get("imglist"), (JSONArray) null);
            if (a2 == null) {
                return;
            }
            for (int i3 = 0; i3 < a2.size(); i3++) {
                JSONObject jSONObject = a2.getJSONObject(i3);
                if (jSONObject != null) {
                    String string = jSONObject.getString("url");
                    if (!StringUtils.isEmpty(string)) {
                        int a3 = ohd.a(cVar.a(), oec.a(jSONObject.get("viewWidth"), -1));
                        int a4 = ohd.a(cVar.a(), oec.a(jSONObject.get(Constants.Name.VIEW_HEIGHT), -1));
                        int i4 = oec.a(jSONObject.get(BlobManager.UPLOAD_IMAGE_TYPE_WEBP), false) ? 4 : 0;
                        ImageLoader i5 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i();
                        if (a3 <= 0 || a4 <= 0) {
                            str = string;
                            i = -1;
                            i2 = -1;
                        } else {
                            i = a3;
                            i2 = a4;
                            str = i5.a(string, a3, a4, ImageLoader.a.a(i4, "", "", "preload"));
                        }
                        i5.a(new ImageLoader.b(cVar.f19938a, cVar.a(), string, str, i, i2, ImageLoader.a.a(i4, "", "", "preload"), true), true, new ImageLoader.c() { // from class: com.taobao.android.layoutmanager.module.ImagePreloadModule.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                            public void onImageLoadFailed() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                                }
                            }

                            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                            public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                                }
                            }
                        });
                    }
                }
            }
        }
    }
}
