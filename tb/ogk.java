package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.view.GravityCompat;
import android.text.SpannableString;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.weex.common.Constants;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class ogk extends ogl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_VALUE = -1;
    public static float l;
    public String A;
    public String B;
    public String D;
    public Typeface E;
    public int o;
    public boolean p;
    public String q;
    public int r;
    public int w;
    public CharSequence y;
    public boolean z;
    public float m = l;
    public int n = 16;
    public int s = 1;
    public int t = 1;
    public int u = Integer.MAX_VALUE;
    public TextUtils.TruncateAt v = TextUtils.TruncateAt.END;
    public int x = 0;
    public int C = -1;
    public boolean F = false;
    public int G = 0;
    public boolean H = true;

    public static /* synthetic */ Object ipc$super(ogk ogkVar, String str, Object... objArr) {
        if (str.hashCode() == -1185345197) {
            super.a((Context) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1378094943);
        l = ohd.b(ab.a(), 14);
    }

    @Override // tb.ogl
    public void a(Context context, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
            return;
        }
        if (hashMap != null) {
            this.B = (String) hashMap.get("trim");
        }
        super.a(context, hashMap);
        if (this.v == null && !hashMap.containsKey(a.ATOM_EXT_UDL_text_align) && !hashMap.containsKey(Constants.Name.ALIGN)) {
            this.n = GravityCompat.START;
        }
        if (this.bt != null && TextUtils.equals(this.bt.K(), "marquee")) {
            this.v = TextUtils.TruncateAt.MARQUEE;
        }
        this.E = ohj.a(context, this.D, this.q, this.z, this.p);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
        if (r9.equals("color") != false) goto L11;
     */
    @Override // tb.ogl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ogk.a(android.content.Context, java.lang.String, java.lang.Object):void");
    }

    public void b(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dff9e1b", new Object[]{this, context, obj});
        } else {
            this.s = odx.a(context, 0, a("color", obj), c(), d());
        }
    }

    public CharSequence a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("2d0b4348", new Object[]{this, str});
        }
        if (str == null) {
            str = "";
        }
        return this.w > 0 ? b(str) : str;
    }

    private SpannableString b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("12ba5f05", new Object[]{this, str});
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ogo(this.w), 0, str.length(), 17);
        return spannableString;
    }

    public static ogk a(aa aaVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ogk) ipChange.ipc$dispatch("c8ebbbd1", new Object[]{aaVar, context, str});
        }
        HashMap hashMap = new HashMap();
        ogk ogkVar = new ogk();
        ogkVar.a(aaVar);
        if (str != null) {
            for (String str2 : oec.a(str, ';')) {
                String[] a2 = oec.a(str2, (char) riy.CONDITION_IF_MIDDLE);
                if (a2 != null && a2.length == 2) {
                    hashMap.put(a2[0].trim(), a2[1].trim());
                }
            }
        }
        ogkVar.a(context, hashMap);
        return ogkVar;
    }

    @Override // tb.ogl
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        CharSequence charSequence = this.y;
        if (charSequence != null) {
            return charSequence.length();
        }
        return 0;
    }

    @Override // tb.ogl
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        CharSequence charSequence = this.y;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
