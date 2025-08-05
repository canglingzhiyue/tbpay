package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.a;
import com.taobao.flowcustoms.afc.model.AfcXbsData;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.afc.xbs.c;
import com.taobao.linkmanager.flowout.e;
import com.taobao.linkmanager.launcher.TbFcLinkInit;

/* loaded from: classes.dex */
public class mbe implements kod {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f31006a;

    static {
        kge.a(-67442557);
        kge.a(-1938433128);
    }

    public static /* synthetic */ c a(mbe mbeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ba389300", new Object[]{mbeVar}) : mbeVar.f31006a;
    }

    @Override // tb.kod
    public void a(final a aVar, final AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e12c632", new Object[]{this, aVar, afcXbsData});
            return;
        }
        if (this.f31006a == null) {
            this.f31006a = new c();
        }
        if (TbFcLinkInit.instance().linkAhead) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.mbe.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        mbe.a(mbe.this).a(aVar, afcXbsData);
                    }
                }
            });
        } else {
            this.f31006a.a(aVar, afcXbsData);
        }
    }

    @Override // tb.kod
    public void a(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc04238d", new Object[]{this, context, aVar});
        } else if (a(aVar)) {
            com.taobao.linkmanager.afc.xbs.a.a(context, aVar);
        } else {
            Intent b = b(aVar);
            if (b == null) {
                return;
            }
            try {
                b.putExtra(com.taobao.linkmanager.flowout.c.VISA, com.taobao.linkmanager.flowout.c.XBS_VISA);
                e.a(context, b);
            } catch (Throwable th) {
                com.taobao.flowcustoms.afc.utils.c.b("linkx", "AlibcPluginUtils === jumpBack  异常：" + th.toString());
            }
        }
    }

    public static boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc9b6d99", new Object[]{aVar})).booleanValue() : (aVar == null || a.b == null || aVar.l == null || !aVar.l.equals("linkPartner")) ? false : true;
    }

    private static Intent b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("5c6beefd", new Object[]{aVar});
        }
        String str = "";
        String str2 = aVar == null ? str : aVar.h;
        if (aVar != null) {
            str = a.b;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        Uri parse = Uri.parse(TFCCommonUtils.a(str2, com.taobao.linkmanager.flowout.c.FL_OUT_ID, com.taobao.linkmanager.flowout.c.XBS_VISA));
        Intent intent = new Intent();
        intent.setData(parse);
        intent.setFlags(268435456);
        intent.setFlags(131072);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return intent;
    }
}
