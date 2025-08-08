package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.richtext.RichText;
import com.taobao.android.weex_uikit.widget.richtext.a;

/* loaded from: classes6.dex */
public class jxd extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String i;

    static {
        kge.a(1140239270);
    }

    public static /* synthetic */ Object ipc$super(jxd jxdVar, String str, Object... objArr) {
        if (str.hashCode() == -650670724) {
            super.a((String) objArr[0], (String) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public jxd(RichText richText) {
        super(richText);
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        super.a(str, str2);
        char c = 65535;
        if (str.hashCode() == -879295043 && str.equals("textDecoration")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        this.i = str2;
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.a
    public CharSequence m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("20819ec6", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        if (this.g != null && this.g.size() > 0) {
            for (a aVar : this.g) {
                sb.append(aVar.m());
            }
        } else if (!StringUtils.isEmpty(j())) {
            if (com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_break_all.equals(d())) {
                CharSequence j = j();
                new StringBuilder();
                for (int i = 0; i < j.length(); i++) {
                    sb.append(j.charAt(i));
                    sb.append("\u200b");
                }
            } else {
                sb.append(j());
            }
        }
        a((CharSequence) sb.toString());
        return k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r4.equals("line-through") != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @Override // com.taobao.android.weex_uikit.widget.richtext.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.text.SpannableString r9, int r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.jxd.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1d
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r2] = r9
            r9 = 2
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r10)
            r1[r9] = r2
            java.lang.String r9 = "1ba1e299"
            r0.ipc$dispatch(r9, r1)
            return
        L1d:
            java.lang.CharSequence r0 = r8.k()
            if (r0 != 0) goto L25
            r0 = 0
            goto L2d
        L25:
            java.lang.CharSequence r0 = r8.k()
            int r0 = r0.length()
        L2d:
            int r0 = r0 + r10
            r8.a(r9, r10, r0)
            r1 = 0
            java.lang.String r4 = r8.i
            if (r4 == 0) goto L6b
            r5 = -1
            int r6 = r4.hashCode()
            r7 = -1171789332(0xffffffffba27e9ec, float:-6.4054015E-4)
            if (r6 == r7) goto L51
            r3 = -1026963764(0xffffffffc2c9c6cc, float:-100.888275)
            if (r6 == r3) goto L46
            goto L5a
        L46:
            java.lang.String r3 = "underline"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L5a
            r3 = 1
            goto L5b
        L51:
            java.lang.String r6 = "line-through"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L5a
            goto L5b
        L5a:
            r3 = -1
        L5b:
            if (r3 == 0) goto L66
            if (r3 == r2) goto L60
            goto L6b
        L60:
            android.text.style.UnderlineSpan r1 = new android.text.style.UnderlineSpan
            r1.<init>()
            goto L6b
        L66:
            android.text.style.StrikethroughSpan r1 = new android.text.style.StrikethroughSpan
            r1.<init>()
        L6b:
            if (r1 == 0) goto L72
            r2 = 33
            r9.setSpan(r1, r10, r0, r2)
        L72:
            r8.b(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jxd.a(android.text.SpannableString, int):void");
    }
}
