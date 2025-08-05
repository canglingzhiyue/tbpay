package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import com.alibaba.android.icart.core.event.ItemOperationSubscriber;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J$\u0010\r\u001a\u00020\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012H\u0007J\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/alibaba/android/icart/core/utils/CartDebugInterface;", "", "()V", "sEventNameCartClearCacheClick", "", "sEventNameCartDebugClick", "interceptDebugPopActionClick", "", "context", "Landroid/content/Context;", "eventName", "component", "Lcom/taobao/android/ultron/common/model/IDMComponent;", "modifyDebugPopOperates", "", "operates", "Ljava/util/ArrayList;", "Lcom/alibaba/android/icart/core/event/ItemOperationSubscriber$ItemOperate;", "Lkotlin/collections/ArrayList;", "showItemInfoDialog", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class ivv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ivv INSTANCE;

    static {
        kge.a(-100911571);
        INSTANCE = new ivv();
    }

    private ivv() {
    }

    @JvmStatic
    public static final boolean a(Context context, String eventName, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84fd336e", new Object[]{context, eventName, iDMComponent})).booleanValue();
        }
        q.d(eventName, "eventName");
        if (context != null && ifp.a()) {
            if (q.a((Object) "cartDebugClick", (Object) eventName)) {
                INSTANCE.a(context, iDMComponent);
                return true;
            } else if (q.a((Object) "cartClearCacheClick", (Object) eventName)) {
                bci.a(context);
                lba.a("已清除缓存，即将自动结束进程");
                if (context instanceof Activity) {
                    jqh.b(a.INSTANCE, 1000L);
                }
                return true;
            }
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Process.killProcess(Process.myPid());
            }
        }
    }

    private final void a(Context context, IDMComponent iDMComponent) {
        JSONObject containerInfo;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d837af4", new Object[]{this, context, iDMComponent});
        } else if (iDMComponent == null || (containerInfo = iDMComponent.getContainerInfo()) == null || (string = containerInfo.getString("name")) == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("模板是否开启Butter：", String.valueOf(aad.b(string)));
            t tVar = t.INSTANCE;
            iwn.a(context, iDMComponent, hashMap);
        }
    }

    @JvmStatic
    public static final void a(ArrayList<ItemOperationSubscriber.ItemOperate> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{arrayList});
        } else if (arrayList == null || !ifp.a()) {
        } else {
            try {
                Result.a aVar = Result.Companion;
                arrayList.add(new ItemOperationSubscriber.ItemOperate("DEBUG组件信息", "cartDebugClick"));
                arrayList.add(new ItemOperationSubscriber.ItemOperate("清除首页缓存", "cartClearCacheClick"));
                Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(i.a(th));
            }
        }
    }
}
