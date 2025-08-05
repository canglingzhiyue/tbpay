package com.taobao.themis.widget.platformview;

import android.content.Context;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.embed.TriverEmbedTBVideoView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class d extends TriverEmbedTBVideoView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context e;
    private b f;

    static {
        kge.a(-191811193);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == 1664325763) {
            super.onCreate((Map) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public d(Context context, b bVar) {
        this.e = context;
        this.f = bVar;
    }

    @Override // com.taobao.avplayer.embed.TriverEmbedTBVideoView, com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        super.onCreate(map);
        try {
            Field declaredField = TriverEmbedTBVideoView.class.getDeclaredField("f");
            declaredField.setAccessible(true);
            declaredField.set(this, new WeakReference(this.e));
        } catch (Throwable th) {
            RVLogger.e("TRWidgetVideoEmbedView", th);
        }
    }

    @Override // com.taobao.avplayer.embed.TriverEmbedTBVideoView, com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void sendEvent(String str, JSONObject jSONObject, IEmbedCallback iEmbedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b74017", new Object[]{this, str, jSONObject, iEmbedCallback});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        bVar.sendEvent(str, jSONObject);
    }
}
