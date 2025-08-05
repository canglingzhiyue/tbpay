package com.taobao.android.litecreator.sdk.nav.interceptor;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.ImageBean;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCMedia;
import com.taobao.android.litecreator.base.data.g;
import com.taobao.android.litecreator.base.workflow.IWorkflowData;
import com.taobao.android.litecreator.sdk.nav.LCNavInterceptor;
import com.taobao.android.litecreator.util.ax;
import com.taobao.android.nav.Nav;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import org.json.JSONObject;
import tb.ior;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lcom/taobao/android/litecreator/sdk/nav/interceptor/PagePublishInterceptor;", "Lcom/taobao/android/litecreator/sdk/nav/LCNavInterceptor;", "()V", "createUGCImage", "Lcom/taobao/android/litecreator/base/data/UGCImage;", "path", "", "doNav", "", "publishConfig", "Lorg/json/JSONObject;", "context", "Landroid/content/Context;", "generateUGCMediaWithImages", "Lcom/taobao/android/litecreator/base/data/UGCMedia;", "importPics", "Lcom/alibaba/fastjson/JSONArray;", "interceptKeyword", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class c extends LCNavInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-302118092);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.litecreator.sdk.nav.LCNavInterceptor
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "litecreator/publish";
    }

    @Override // com.taobao.android.litecreator.sdk.nav.LCNavInterceptor
    public void a(JSONObject publishConfig, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0f2232", new Object[]{this, publishConfig, context});
            return;
        }
        q.d(publishConfig, "publishConfig");
        q.d(context, "context");
        PagePublishInterceptor$doNav$doNavAction$1 pagePublishInterceptor$doNav$doNavAction$1 = new PagePublishInterceptor$doNav$doNavAction$1(this, context, publishConfig);
        if (publishConfig.has(UmiWvPlugin.KEY_IMPORT_PICS)) {
            JSONArray importPicArray = JSONArray.parseArray(publishConfig.getString(UmiWvPlugin.KEY_IMPORT_PICS));
            q.b(importPicArray, "importPicArray");
            UGCMedia a2 = a(importPicArray);
            if (a2 != null) {
                a2.setPublishSessionId(a(publishConfig));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ior.f29193a, a2.getPublishSessionId());
                Uri a3 = ax.a(UmiWvPlugin.NEW_PUBLISH_PATH, jSONObject);
                q.b(a3, "UriUtil.buildUriWithUrlA…try/publish.html\", query)");
                Bundle bundle = new Bundle();
                bundle.putSerializable(IWorkflowData.KEY, a2);
                Nav.from(context).withExtras(bundle).toUri(a3);
                return;
            }
            pagePublishInterceptor$doNav$doNavAction$1.mo2427invoke();
            return;
        }
        pagePublishInterceptor$doNav$doNavAction$1.mo2427invoke();
    }

    private final UGCMedia a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UGCMedia) ipChange.ipc$dispatch("6b9c8603", new Object[]{this, jSONArray});
        }
        if (jSONArray.size() == 0) {
            return null;
        }
        UGCMedia uGCMedia = new UGCMedia();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            UGCImage a2 = a(jSONArray.getString(i));
            if (a2 != null) {
                uGCMedia.appendImage(a2);
            }
        }
        return uGCMedia;
    }

    private final UGCImage a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UGCImage) ipChange.ipc$dispatch("eed3758e", new Object[]{this, str});
        }
        ImageBean a2 = g.a(str);
        if (a2 == null) {
            return null;
        }
        q.b(a2, "UGCMediaGenerator.newIma…Bean(path) ?: return null");
        UGCImage uGCImage = new UGCImage();
        uGCImage.origin = a2;
        uGCImage.compress = uGCImage.origin;
        return uGCImage;
    }
}
