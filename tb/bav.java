package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class bav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25738a = "AURAConfigLoader";
    private AURAPluginContainerNodeModel b;
    private final ExecutorService c;
    private final String d;

    static {
        kge.a(-1848032710);
    }

    public static /* synthetic */ AURAPluginContainerNodeModel a(bav bavVar, AURAPluginContainerNodeModel aURAPluginContainerNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("1d1e2f93", new Object[]{bavVar, aURAPluginContainerNodeModel});
        }
        bavVar.b = aURAPluginContainerNodeModel;
        return aURAPluginContainerNodeModel;
    }

    public static /* synthetic */ String a(bav bavVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dabe1b5f", new Object[]{bavVar}) : bavVar.d;
    }

    public bav(String str) {
        this.d = str;
        this.c = bbh.a(2, 4, 1L, TimeUnit.MINUTES, this.d);
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            a(context, str, null);
        }
    }

    public void a(final Context context, final String str, final aqt<AURAPluginContainerNodeModel> aqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad605d6", new Object[]{this, context, str, aqtVar});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.c.execute(new Runnable() { // from class: tb.bav.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        AURAPluginContainerNodeModel aURAPluginContainerNodeModel = (AURAPluginContainerNodeModel) JSON.parseObject(bss.a(context, str), AURAPluginContainerNodeModel.class);
                        bav.a(bav.this, aURAPluginContainerNodeModel);
                        if (aqtVar != null) {
                            aqtVar.a(aURAPluginContainerNodeModel);
                        }
                        ard a2 = arc.a();
                        a2.a("AURAConfigLoader", "asyncLoad", bav.a(bav.this) + "|异步加载成功:" + str);
                    } catch (Throwable th) {
                        ard a3 = arc.a();
                        a3.c("AURAConfigLoader", "asyncLoad", bav.a(bav.this) + "|异步加载配置失败:" + str + ",error=" + th.getMessage());
                    }
                }
            });
        }
    }

    public AURAPluginContainerNodeModel a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("4dd6302a", new Object[]{this}) : this.b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c.isShutdown()) {
        } else {
            this.c.shutdownNow();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        b();
        this.b = null;
    }
}
