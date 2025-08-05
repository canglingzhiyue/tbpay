package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.d;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.qrcode.c;
import com.taobao.share.ui.engine.render.b;
import com.taobao.tao.handler.worker.e;
import com.taobao.tao.handler.worker.f;
import com.taobao.tao.handler.worker.g;
import com.taobao.tao.util.AnalyticsUtil;
import com.ut.share.business.ShareTargetType;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class oif implements nzn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public oip f32085a = new a();
    public b b;
    public oin c;

    static {
        kge.a(1117245655);
        kge.a(1924594772);
    }

    public oif() {
        ShareBizAdapter.getInstance().getShareEngine().initHandlerMappings(this);
        this.c = this.f32085a.a(this);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ab3fdb", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }

    @Override // tb.nzn
    public void a(d dVar, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8a44da", new Object[]{this, dVar, context, new Integer(i)});
            return;
        }
        com.taobao.share.globalmodel.b a2 = dVar.a();
        a(a2);
        b(a2);
        this.c.a(this.b, dVar, context, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
        if (android.text.TextUtils.equals(r0.getPath(), r1.getPath()) == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.taobao.share.globalmodel.b r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.oif.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r7 = "2c8f04a1"
            r0.ipc$dispatch(r7, r1)
            return
        L15:
            boolean r0 = r7 instanceof com.taobao.share.ui.engine.structure.a
            if (r0 == 0) goto Lff
            r0 = r7
            com.taobao.share.ui.engine.structure.a r0 = (com.taobao.share.ui.engine.structure.a) r0
            com.taobao.share.globalmodel.a r1 = r0.d()
            if (r1 == 0) goto L33
            com.taobao.share.globalmodel.a r0 = r0.d()
            java.lang.String r0 = r0.i()
            java.lang.String r1 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L33
            return
        L33:
            com.taobao.share.globalmodel.c r0 = r7.a()
            if (r0 == 0) goto Lff
            com.taobao.share.globalmodel.c r0 = r7.a()
            com.taobao.share.globalmodel.TBShareContent r0 = r0.a()
            if (r0 == 0) goto Lff
            com.taobao.share.globalmodel.c r0 = r7.a()
            com.taobao.share.globalmodel.TBShareContent r0 = r0.a()
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.extraParams
            if (r0 == 0) goto Lff
            com.taobao.share.globalmodel.c r0 = r7.a()
            com.taobao.share.globalmodel.TBShareContent r0 = r0.a()
            java.lang.String r0 = r0.openMultiTargetUrl
            java.lang.String r1 = "true"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L64
            goto Lff
        L64:
            com.taobao.share.globalmodel.c r0 = r7.a()     // Catch: java.lang.Throwable -> La9
            com.taobao.share.globalmodel.TBShareContent r0 = r0.a()     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = r0.url     // Catch: java.lang.Throwable -> La9
            com.taobao.share.globalmodel.c r1 = r7.a()     // Catch: java.lang.Throwable -> La9
            com.taobao.share.globalmodel.TBShareContent r1 = r1.a()     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = r1._initShareUrl     // Catch: java.lang.Throwable -> La9
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> La9
            if (r4 != 0) goto La9
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> La9
            if (r4 != 0) goto La9
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> La9
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> La9
            java.lang.String r4 = r0.getHost()     // Catch: java.lang.Throwable -> La9
            java.lang.String r5 = r1.getHost()     // Catch: java.lang.Throwable -> La9
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch: java.lang.Throwable -> La9
            if (r4 == 0) goto Laa
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> La9
            boolean r0 = android.text.TextUtils.equals(r0, r1)     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto La9
            goto Laa
        La9:
            r2 = 0
        Laa:
            if (r2 == 0) goto Lad
            return
        Lad:
            com.taobao.share.globalmodel.c r0 = r7.a()
            com.taobao.share.globalmodel.TBShareContent r0 = r0.a()
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.extraParams
            java.lang.String r1 = "defineToolParams"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.alibaba.fastjson.JSONArray r0 = com.alibaba.fastjson.JSONObject.parseArray(r0)
            if (r0 == 0) goto Lff
        Lc5:
            int r1 = r0.size()
            if (r3 >= r1) goto Lff
            com.alibaba.fastjson.JSONObject r1 = r0.getJSONObject(r3)
            if (r1 == 0) goto Lfc
            java.lang.String r2 = r7.b()
            java.lang.String r4 = "type"
            java.lang.String r4 = r1.getString(r4)
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 == 0) goto Lfc
            java.lang.String r2 = "shareUrl"
            java.lang.String r4 = r1.getString(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto Lfc
            com.taobao.share.globalmodel.c r4 = r7.a()
            com.taobao.share.globalmodel.TBShareContent r4 = r4.a()
            java.lang.String r1 = r1.getString(r2)
            r4.url = r1
        Lfc:
            int r3 = r3 + 1
            goto Lc5
        Lff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oif.a(com.taobao.share.globalmodel.b):void");
    }

    private void b(com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4036d822", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            if (bVar instanceof com.taobao.share.ui.engine.structure.a) {
                com.taobao.share.ui.engine.structure.a aVar = (com.taobao.share.ui.engine.structure.a) bVar;
                if (aVar.c != null && TextUtils.equals("program", aVar.c.getString("triggerBy"))) {
                    return;
                }
            }
            com.taobao.share.taopassword.b.a(ShareTargetType.getEnum(bVar.b()));
            AnalyticsUtil.traceChannelSelect(bVar);
        }
    }

    public void a(Context context, com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a21c99", new Object[]{this, context, bVar});
            return;
        }
        com.taobao.tao.handler.worker.d dVar = new com.taobao.tao.handler.worker.d(this);
        if (obl.b()) {
            dVar.b(context, bVar);
        } else {
            dVar.a(context, bVar);
        }
    }

    public void b(Context context, com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e08c38", new Object[]{this, context, bVar});
        } else {
            new com.taobao.tao.handler.worker.b(this).a(context, bVar);
        }
    }

    public void a(String str, boolean z, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a27e269", new Object[]{this, str, new Boolean(z), aVar});
        } else {
            new e(this).a(str, z, aVar);
        }
    }

    public void a(String str, String str2, boolean z, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2c2867", new Object[]{this, str, str2, new Boolean(z), aVar});
        } else {
            new com.taobao.tao.handler.worker.c(this).a(str, str2, z, aVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            new com.taobao.tao.handler.worker.a(this).d();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            new g(this).d();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            new f(this).a(str);
        }
    }

    /* loaded from: classes8.dex */
    public static class a implements oip {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1270299272);
            kge.a(-1870918916);
        }

        @Override // tb.oip
        public oin a(oif oifVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oin) ipChange.ipc$dispatch("e0d87026", new Object[]{this, oifVar});
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new oiv(oifVar));
            arrayList.add(new oit(oifVar));
            arrayList.add(new oix(oifVar));
            arrayList.add(new oiu(oifVar));
            arrayList.add(new oiw(oifVar));
            arrayList.add(new ois(oifVar));
            return new oin(arrayList);
        }
    }
}
