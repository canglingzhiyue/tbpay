package tb;

import android.text.SpannableString;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.i;
import com.taobao.android.weex_uikit.widget.richtext.RichText;
import com.taobao.android.weex_uikit.widget.richtext.a;

/* loaded from: classes6.dex */
public class jxc extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final CharSequence i;
    private int j;
    private int k;
    private int l;
    private int m;
    private String n;

    public static /* synthetic */ Object ipc$super(jxc jxcVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -650670724) {
            super.a((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 545365702) {
            return super.m();
        } else {
            if (hashCode != 1708636285) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.b((String) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.a
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(768755203);
        i = " i ";
    }

    public jxc(RichText richText) {
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
        switch (str.hashCode()) {
            case -1221029593:
                if (str.equals("height")) {
                    c = 1;
                    break;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    c = 0;
                    break;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    c = 3;
                    break;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.j = Math.round(i.a(str2, this.h.getInstance().getRpxPerRem()));
        } else if (c == 1) {
            this.k = Math.round(i.a(str2, this.h.getInstance().getRpxPerRem()));
        } else if (c == 2) {
            this.l = Math.round(i.a(str2, this.h.getInstance().getRpxPerRem()));
        } else if (c != 3) {
        } else {
            this.m = Math.round(i.a(str2, this.h.getInstance().getRpxPerRem()));
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.a
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        super.b(str, str2);
        char c = 65535;
        if (str.hashCode() == 114148 && str.equals("src")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        this.n = str2;
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.a
    public CharSequence m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("20819ec6", new Object[]{this});
        }
        if (TextUtils.isEmpty(j())) {
            b(i);
        }
        return super.m();
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.a
    public void a(SpannableString spannableString, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba1e299", new Object[]{this, spannableString, new Integer(i2)});
            return;
        }
        jxe jxeVar = new jxe(this.j, this.k, this.l, this.m, this.n);
        spannableString.setSpan(jxeVar, i2, k().length() + i2, 33);
        this.h.addImageSpan(jxeVar);
    }
}
