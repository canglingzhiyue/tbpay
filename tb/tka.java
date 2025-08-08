package tb;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.globalmodel.f;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.b;
import com.taobao.share.taopassword.constants.TPAction;
import com.taobao.share.taopassword.genpassword.model.a;
import com.ut.share.ShareServiceApi;
import com.ut.share.business.ShareTargetType;
import java.util.Map;

/* loaded from: classes8.dex */
public class tka implements oiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Toast f34172a;

    static {
        kge.a(864414670);
        kge.a(-2068678803);
    }

    public static /* synthetic */ void a(tka tkaVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d317d04", new Object[]{tkaVar, context, str});
        } else {
            tkaVar.a(context, str);
        }
    }

    public static /* synthetic */ void b(tka tkaVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e67cfe3", new Object[]{tkaVar, context, str});
        } else {
            tkaVar.g(context, str);
        }
    }

    public static /* synthetic */ void c(tka tkaVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9e22c2", new Object[]{tkaVar, context, str});
        } else {
            tkaVar.e(context, str);
        }
    }

    public static /* synthetic */ void d(tka tkaVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d475a1", new Object[]{tkaVar, context, str});
        } else {
            tkaVar.d(context, str);
        }
    }

    public static /* synthetic */ void e(tka tkaVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("820ac880", new Object[]{tkaVar, context, str});
        } else {
            tkaVar.f(context, str);
        }
    }

    public static /* synthetic */ void f(tka tkaVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83411b5f", new Object[]{tkaVar, context, str});
        } else {
            tkaVar.c(context, str);
        }
    }

    public static /* synthetic */ void g(tka tkaVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84776e3e", new Object[]{tkaVar, context, str});
        } else {
            tkaVar.b(context, str);
        }
    }

    @Override // tb.oiq
    public void a(final String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        try {
            TBShareContent j = e.b().j();
            final Context applicationContext = nym.a().getApplicationContext();
            String str2 = j.description;
            f g = e.b().g();
            if (g != null && !StringUtils.isEmpty(g.f19632a)) {
                str2 = g.f19632a + " " + str2;
            }
            final a aVar = new a();
            aVar.f19662a = j.businessId;
            aVar.c = str2;
            aVar.d = ShareServiceApi.urlBackFlow(j.businessId, "other", j.url);
            aVar.e = j.imageUrl;
            aVar.f = j.shareScene;
            aVar.j = j.extraParams;
            aVar.b = j.title;
            if (!StringUtils.isEmpty("other")) {
                aVar.m = "other".toLowerCase();
            } else {
                aVar.m = "other";
            }
            aVar.k = j.popType.name;
            aVar.l = j.popUrl;
            if (j.disableBackToClient) {
                aVar.n = 0;
            }
            oah.a().a(nym.a().getApplicationContext(), aVar, TPAction.OTHER, new oal() { // from class: tb.tka.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.oal
                public void a(obd obdVar, com.taobao.share.taopassword.busniess.model.e eVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dbeaf3eb", new Object[]{this, obdVar, eVar});
                        return;
                    }
                    String str3 = null;
                    if (eVar != null) {
                        try {
                            str3 = eVar.b;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    if (StringUtils.isEmpty(str3)) {
                        String str4 = aVar.c;
                        str3 = b.c(StringUtils.isEmpty(str4) ? aVar.d : str4.concat(" ").concat(aVar.d));
                        oah.a(applicationContext, aVar.d);
                    }
                    if (Build.VERSION.SDK_INT >= 11) {
                        ((ClipboardManager) applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("com.ut.share.copy.data", str3));
                    } else {
                        ((android.text.ClipboardManager) applicationContext.getSystemService("clipboard")).setText(str3);
                    }
                    if (ShareTargetType.Share2Messenger.getValue().equals(str)) {
                        tka.a(tka.this, applicationContext, str3);
                    } else if (ShareTargetType.Share2Telegram.getValue().equals(str)) {
                        tka.b(tka.this, applicationContext, str3);
                    } else if (ShareTargetType.Share2WeChat.getValue().equals(str)) {
                        tka.c(tka.this, applicationContext, str3);
                    } else if (ShareTargetType.Share2WhatsApp.getValue().equals(str)) {
                        tka.d(tka.this, applicationContext, str3);
                    } else if (ShareTargetType.Share2Instagram.getValue().equals(str)) {
                        tka.e(tka.this, applicationContext, str3);
                    } else if (ShareTargetType.Share2Facebook.getValue().equals(str)) {
                        tka.f(tka.this, applicationContext, str3);
                    } else if (!ShareTargetType.Share2Line.getValue().equals(str)) {
                    } else {
                        tka.g(tka.this, applicationContext, str3);
                    }
                }
            }, ShareBizAdapter.getInstance().getAppEnv().a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (h(context, "com.facebook.orca")) {
            a(context, "com.facebook.orca", str);
        } else {
            a(context, "The app not installed");
        }
    }

    private void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, str});
        } else if (h(context, "jp.naver.line.android")) {
            try {
                String encode = Uri.encode(str);
                Nav from = Nav.from(context);
                Intent intentForUri = from.intentForUri("line://msg/text/" + encode);
                intentForUri.addFlags(268435456);
                context.startActivity(intentForUri);
            } catch (Throwable unused) {
            }
        } else {
            a(context, "The app not installed");
        }
    }

    private void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{this, context, str});
        } else if (h(context, "com.facebook.katana")) {
            a(context, "com.facebook.katana", str);
        } else {
            a(context, "The app not installed");
        }
    }

    private void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161bc7", new Object[]{this, context, str});
        } else if (h(context, "com.whatsapp")) {
            a(context, "com.whatsapp", str);
        } else {
            a(context, "The app not installed");
        }
    }

    private void e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e0bda6", new Object[]{this, context, str});
        } else if (h(context, "com.tencent.mm")) {
            a(context, "com.tencent.mm", str);
        } else {
            a(context, "The app not installed");
        }
    }

    private void f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ab5f85", new Object[]{this, context, str});
        } else if (h(context, "com.instagram.android")) {
            a(context, "com.instagram.android", str);
        } else {
            a(context, "The app not installed");
        }
    }

    private void g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc760164", new Object[]{this, context, str});
        } else if (h(context, "org.telegram.messenger")) {
            a(context, "org.telegram.messenger", str);
        } else {
            a(context, "The app not installed");
        }
    }

    private boolean h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f640a347", new Object[]{this, context, str})).booleanValue();
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{this, context, str, str2});
        } else if (str2 == null) {
        } else {
            try {
                context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
            } catch (Throwable unused) {
            }
        }
    }

    public void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95562904", new Object[]{this, context, charSequence});
        } else if (StringUtils.isEmpty(charSequence)) {
        } else {
            Toast toast = f34172a;
            if (toast == null) {
                f34172a = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            } else {
                toast.setText(charSequence);
            }
            f34172a.show();
        }
    }
}
