package tb;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.s;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import java.util.Map;

/* loaded from: classes8.dex */
public class ogq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(284651219);
    }

    public static View a(Context context, String str, String str2, String str3, String str4, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e0bdaee4", new Object[]{context, str, str2, str3, str4, aVar});
        }
        if (!StringUtils.isEmpty(str4) && oeb.cg()) {
            try {
                Uri.Builder buildUpon = Uri.parse(str4).buildUpon();
                if (!StringUtils.isEmpty(str2)) {
                    buildUpon.appendQueryParameter("code", str2);
                }
                if (!StringUtils.isEmpty(str3)) {
                    buildUpon.appendQueryParameter("msg", str3);
                }
                return TNodeView.create(context, null, null, buildUpon.build().toString(), null, null, new TNodeView.c() { // from class: tb.ogq.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.c
                    public void onStartLayout(m.b bVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f67932cf", new Object[]{this, bVar});
                        }
                    }

                    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
                    public void onLayoutCompleted(aa aaVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3fb42811", new Object[]{this, aaVar});
                            return;
                        }
                        ogg.b("errorPage url render complete");
                        aaVar.k().a((s) new b(a.this));
                    }

                    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
                    public void onLayoutError() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("834776a6", new Object[]{this});
                        } else {
                            ogg.b("errorPage url render error");
                        }
                    }
                });
            } catch (Exception e) {
                ogg.b("errorPage url parse error:" + e.getMessage());
                return a(context, str, aVar);
            }
        }
        return a(context, str, aVar);
    }

    private static View a(Context context, String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fbca8986", new Object[]{context, str, aVar});
        }
        TBErrorView j = ohd.j(context);
        j.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "刷新", new View.OnClickListener() { // from class: tb.ogq.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                a aVar2 = a.this;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a();
            }
        });
        Error newError = Error.Factory.newError(null, null);
        newError.url = str;
        j.setError(newError);
        return j;
    }

    /* loaded from: classes8.dex */
    public static class b implements s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private a f32042a;

        static {
            kge.a(-1523251558);
            kge.a(-1420926486);
        }

        public b(a aVar) {
            this.f32042a = aVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.s
        public boolean onHandleTNodeMessage(aa aaVar, aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
            }
            if (!"onretry".equals(str)) {
                return false;
            }
            a aVar = this.f32042a;
            if (aVar != null) {
                aVar.a();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.s
        public boolean onHandleMessage(aa.e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue() : onHandleTNodeMessage(eVar.f20300a, eVar.b, eVar.c, null, eVar.d, eVar.e);
        }
    }
}
