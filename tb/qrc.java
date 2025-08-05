package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.qrd;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0002\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u0002\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b\u001a\f\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u0002¨\u0006\u0010"}, d2 = {"getContainerConfigAsync", "", "Lcom/taobao/themis/kernel/TMSInstance;", "pubContainerConfigTaskListener", "Lcom/taobao/themis/pub_kit/task/PubContainerConfigTask$PubContainerConfigTaskListener;", "getContainerConfigSync", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "getDeltaSync", "Lcom/alibaba/fastjson/JSONObject;", "getHomeDataAsync", "pubHomeDataTaskListener", "Lcom/taobao/themis/pub_kit/task/PubHomeDataTask$PubHomeDataTaskListener;", "getHomePagePopDataListSync", "Lcom/alibaba/fastjson/JSONArray;", "getPubContainerContext", "Lcom/taobao/themis/pub_kit/config/PubContainerContext;", "themis_pub_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class qrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1007954698);
    }

    public static final void a(f getContainerConfigAsync, qrd.b pubContainerConfigTaskListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7617405c", new Object[]{getContainerConfigAsync, pubContainerConfigTaskListener});
            return;
        }
        q.d(getContainerConfigAsync, "$this$getContainerConfigAsync");
        q.d(pubContainerConfigTaskListener, "pubContainerConfigTaskListener");
        qrd qrdVar = (qrd) getContainerConfigAsync.a(qrd.class);
        if (qrdVar == null) {
            return;
        }
        qrdVar.a(pubContainerConfigTaskListener);
    }

    public static final JSONArray a(f getHomePagePopDataListSync) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("893d8a71", new Object[]{getHomePagePopDataListSync});
        }
        q.d(getHomePagePopDataListSync, "$this$getHomePagePopDataListSync");
        qre qreVar = (qre) getHomePagePopDataListSync.a(qre.class);
        if (qreVar == null) {
            return null;
        }
        return qreVar.b();
    }

    public static final JSONObject b(f getDeltaSync) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b50db94e", new Object[]{getDeltaSync});
        }
        q.d(getDeltaSync, "$this$getDeltaSync");
        qre qreVar = (qre) getDeltaSync.a(qre.class);
        if (qreVar == null) {
            return null;
        }
        return qreVar.c();
    }

    public static final PubContainerContext c(f getPubContainerContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubContainerContext) ipChange.ipc$dispatch("4d6eb687", new Object[]{getPubContainerContext});
        }
        q.d(getPubContainerContext, "$this$getPubContainerContext");
        return (PubContainerContext) getPubContainerContext.a(PubContainerContext.class);
    }
}
