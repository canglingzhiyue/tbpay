package tb;

import android.text.TextUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.LSDB;
import com.taobao.android.protodb.e;
import com.taobao.android.tschedule.i;

/* loaded from: classes6.dex */
public class jme {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CDN_SUFFIX = "_cdn";

    /* renamed from: a  reason: collision with root package name */
    private static LSDB f29627a;
    private static volatile jme b;

    static {
        kge.a(1641119846);
    }

    public static /* synthetic */ boolean a(jme jmeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("efa58c1a", new Object[]{jmeVar})).booleanValue() : jmeVar.c();
    }

    public static /* synthetic */ LSDB b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LSDB) ipChange.ipc$dispatch("8b49c999", new Object[0]) : f29627a;
    }

    private jme() {
        c();
    }

    public static jme a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jme) ipChange.ipc$dispatch("f0679dc", new Object[0]);
        }
        if (b == null) {
            synchronized (jme.class) {
                if (b == null) {
                    b = new jme();
                }
            }
        }
        return b;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (f29627a == null) {
            f29627a = LSDB.open("TScheduleBridgeModule", null);
        }
        return f29627a != null;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (c()) {
            return f29627a.contains(new e(str));
        }
        return false;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (c()) {
            return f29627a.getString(new e(str));
        }
        return null;
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (c()) {
            return f29627a.insertString(new e(str), str2);
        }
        return false;
    }

    public void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
        } else {
            i.b().a(new Runnable() { // from class: tb.jme.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Response syncSend = new DegradableNetwork(com.taobao.android.tschedule.e.b()).syncSend(new RequestImpl(str), null);
                    if (syncSend == null || syncSend.getStatusCode() != 200 || syncSend.getBytedata() == null) {
                        return;
                    }
                    String str2 = new String(syncSend.getBytedata());
                    if (TextUtils.isEmpty(str2) || !jme.a(jme.this)) {
                        return;
                    }
                    jme.b().insertString(new e(str), str2);
                }
            });
        }
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        if (c()) {
            return f29627a.delete(new e(str));
        }
        return false;
    }
}
