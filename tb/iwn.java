package tb;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\"\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J4\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0011H\u0007¨\u0006\u0012"}, d2 = {"Lcom/alibaba/android/ultron/vfw/util/UltronDebugInterface;", "", "()V", "disableDebugDialog", "", "bizCode", "", "registerLongClickListenerForDXItem", "", "dxRootView", "Lcom/taobao/android/dinamicx/DXRootView;", "component", "Lcom/taobao/android/ultron/common/model/IDMComponent;", "showItemInfoDialog", "context", "Landroid/content/Context;", "customInfos", "", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class iwn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final iwn INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29378a;
        public final /* synthetic */ DXRootView b;
        public final /* synthetic */ IDMComponent c;

        public a(String str, DXRootView dXRootView, IDMComponent iDMComponent) {
            this.f29378a = str;
            this.b = dXRootView;
            this.c = iDMComponent;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            if (!iwn.a(iwn.INSTANCE, this.f29378a)) {
                iwn.a(this.b.getContext(), this.c, (Map<String, String>) null);
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\t"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick", "com/alibaba/android/ultron/vfw/util/UltronDebugInterface$showItemInfoDialog$result$1$dialog$1$3", "com/alibaba/android/ultron/vfw/util/UltronDebugInterface$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29379a;
        public final /* synthetic */ StringBuilder b;
        public final /* synthetic */ Ref.ObjectRef c;
        public final /* synthetic */ IDMComponent d;
        public final /* synthetic */ Context e;
        public final /* synthetic */ Map f;

        public b(String str, StringBuilder sb, Ref.ObjectRef objectRef, IDMComponent iDMComponent, Context context, Map map) {
            this.f29379a = str;
            this.b = sb;
            this.c = objectRef;
            this.d = iDMComponent;
            this.e = context;
            this.f = map;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            Object systemService = ((Context) this.c.element).getSystemService("clipboard");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
            }
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(this.f29379a, this.f29379a + "\n" + ((Object) this.b)));
        }
    }

    static {
        kge.a(103642981);
        INSTANCE = new iwn();
    }

    private iwn() {
    }

    public static final /* synthetic */ boolean a(iwn iwnVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("31e619a6", new Object[]{iwnVar, str})).booleanValue() : iwnVar.a(str);
    }

    @JvmStatic
    public static final void a(String str, DXRootView dxRootView, IDMComponent component) {
        DXWidgetNode flattenWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1fe581", new Object[]{str, dxRootView, component});
            return;
        }
        q.d(dxRootView, "dxRootView");
        q.d(component, "component");
        if (INSTANCE.a(str)) {
            return;
        }
        View view = null;
        if (dxRootView.getFlattenWidgetNode() != null && (flattenWidgetNode = dxRootView.getFlattenWidgetNode()) != null && flattenWidgetNode.getDXRuntimeContext() != null) {
            DXRuntimeContext dXRuntimeContext = flattenWidgetNode.getDXRuntimeContext();
            q.b(dXRuntimeContext, "widgetNode.dxRuntimeContext");
            view = dXRuntimeContext.v();
        }
        if (view == null) {
            return;
        }
        view.setOnLongClickListener(new a(str, dxRootView, component));
    }

    private final boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : !ifp.a() || !jqi.a(str, "showDebugDialogOnLongClick", false);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.content.Context, T] */
    @JvmStatic
    public static final void a(Context context, IDMComponent iDMComponent, Map<String, String> map) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77329a11", new Object[]{context, iDMComponent, map});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        if (iDMComponent != null && context != 0) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = context;
            if (context instanceof fpz) {
                objectRef.element = ((fpz) context).a();
            }
            if (((Context) objectRef.element) == null) {
                return;
            }
            AlertDialog create = new AlertDialog.Builder((Context) objectRef.element).create();
            String str = "组件：" + iDMComponent.getKey();
            create.setTitle(str);
            StringBuilder sb = new StringBuilder();
            JSONObject containerInfo = iDMComponent.getContainerInfo();
            if (containerInfo != null) {
                String string = containerInfo.getString("name");
                String string2 = containerInfo.getString("version");
                sb.append("模板类型：");
                sb.append(iDMComponent.getContainerType());
                sb.append("\n模板名称：");
                sb.append(string);
                sb.append("\n模板版本：");
                sb.append(string2);
            }
            if (map != null) {
                for (String str2 : map.keySet()) {
                    sb.append('\n' + str2);
                    sb.append(map.get(str2));
                }
            }
            sb.append("\n\n-------fields-------\n");
            sb.append(JSON.toJSONString(iDMComponent.getFields()));
            sb.append("\n\n-------events-------\n");
            sb.append(iDMComponent.getEvents());
            create.setButton(-1, "关闭", c.INSTANCE);
            create.setButton(-2, "复制到剪切板", new b(str, sb, objectRef, iDMComponent, context, map));
            create.setMessage(sb);
            create.setCancelable(true);
            create.show();
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
            if (!Result.m2377isFailureimpl(m2371constructorimpl)) {
                return;
            }
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            jqg.a("UltronDebugInterfaceException", m2374exceptionOrNullimpl != null ? m2374exceptionOrNullimpl.getMessage() : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c INSTANCE = new c();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                dialogInterface.dismiss();
            }
        }
    }
}
