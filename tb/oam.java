package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.busniess.model.d;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class oam {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static oam f31878a;

        static {
            kge.a(-1108264683);
            f31878a = new oam();
        }

        public static /* synthetic */ oam a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (oam) ipChange.ipc$dispatch("f0893a3", new Object[0]) : f31878a;
        }
    }

    static {
        kge.a(-1498000318);
    }

    public static oam a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oam) ipChange.ipc$dispatch("f0893a3", new Object[0]) : a.a();
    }

    private oam() {
    }

    public void a(Context context, d dVar, oas oasVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c23d42", new Object[]{this, context, dVar, oasVar});
            return;
        }
        String a2 = ShareBizAdapter.getInstance().getAppEnv().a();
        if (TextUtils.isEmpty(a2)) {
            throw new Exception("miss ttid");
        }
        oaz oazVar = new oaz();
        oazVar.f31882a = dVar.f19658a;
        oazVar.b = dVar.b;
        a(context, oazVar, oasVar, a2);
    }

    public void a(Context context, oaz oazVar, oas oasVar, String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314198e1", new Object[]{this, context, oazVar, oasVar, str});
        } else if (oasVar == null) {
            throw new Exception("listener can not be null!");
        } else {
            if (TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(nzt.b())) {
                    throw new Exception("ttid is null.");
                }
            } else {
                nzt.a(str);
            }
            if (TextUtils.isEmpty(oazVar.f31882a)) {
                return;
            }
            a(context, oazVar, oasVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.oam$1] */
    private void a(final Context context, final oaz oazVar, final oas oasVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7edd6d7", new Object[]{this, context, oazVar, oasVar});
        } else if (oasVar == null) {
        } else {
            new AsyncTask<Void, Void, oat>() { // from class: tb.oam.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, tb.oat] */
                @Override // android.os.AsyncTask
                public /* synthetic */ oat doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(oat oatVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, oatVar});
                    } else {
                        a(oatVar);
                    }
                }

                public oat a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (oat) ipChange2.ipc$dispatch("d68d0c10", new Object[]{this, voidArr});
                    }
                    ArrayList<oaq> a2 = oan.a();
                    for (int i = 0; i < a2.size(); i++) {
                        try {
                            oat a3 = a2.get(i).a(context, oazVar);
                            if (a3 != null && a3.f31880a) {
                                return a3;
                            }
                        } catch (Throwable th) {
                            Log.e("TPQueryManager", "check error：" + th.getMessage());
                        }
                    }
                    return null;
                }

                public void a(oat oatVar) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f78b7eb6", new Object[]{this, oatVar});
                        return;
                    }
                    oas oasVar2 = oasVar;
                    if (oatVar == null || !oatVar.f31880a) {
                        z = false;
                    }
                    oasVar2.a(z);
                }
            }.execute(new Void[0]);
        }
    }
}
