package com.taobao.android.weex_uikit.ui;

import com.alibaba.fastjson.parser.JSONLexer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.common.MUSConstants;
import com.taobao.weex.utils.WXUtils;
import tb.jwx;
import tb.kge;

/* loaded from: classes6.dex */
public class ab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private UINode f16128a;

    static {
        kge.a(-1675834552);
    }

    public ab(UINode uINode) {
        this.f16128a = uINode;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f16128a.getNodeInfo().a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean a(String str, MUSValue mUSValue) throws Exception {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bf0a3e3", new Object[]{this, str, mUSValue})).booleanValue();
        }
        switch (str.hashCode()) {
            case -1998952146:
                if (str.equals("transitionDelay")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -1989576717:
                if (str.equals("borderRightColor")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1974639039:
                if (str.equals("borderRightStyle")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1971292586:
                if (str.equals("borderRightWidth")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1724158635:
                if (str.equals("transition")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -1551689441:
                if (str.equals(MUSConstants.ARIA_ROLE)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1470826662:
                if (str.equals("borderTopColor")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1455888984:
                if (str.equals("borderTopStyle")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1452542531:
                if (str.equals("borderTopWidth")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1308858324:
                if (str.equals("borderBottomColor")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1293920646:
                if (str.equals("borderBottomStyle")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1290574193:
                if (str.equals("borderBottomWidth")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1111969773:
                if (str.equals("ariaHidden")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -962590849:
                if (str.equals("direction")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -863700117:
                if (str.equals("ariaLabel")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -806339567:
                if (str.equals("padding")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -699883785:
                if (str.equals("transitionTimingFunction")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case -242276144:
                if (str.equals("borderLeftColor")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -227338466:
                if (str.equals("borderLeftStyle")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -223992013:
                if (str.equals("borderLeftWidth")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 425064969:
                if (str.equals("transitionDuration")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    c = WXUtils.PERCENT;
                    break;
                }
                c = 65535;
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    c = JSONLexer.EOI;
                    break;
                }
                c = 65535;
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1052666732:
                if (str.equals("transform")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1423936074:
                if (str.equals("transitionProperty")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1671764162:
                if (str.equals("display")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                c(mUSValue);
                return true;
            case 1:
                d(mUSValue);
                return true;
            case 2:
                l(mUSValue);
                return true;
            case 3:
                q(mUSValue);
                return true;
            case 4:
                o(mUSValue);
                return true;
            case 5:
                p(mUSValue);
                return true;
            case 6:
                n(mUSValue);
                return true;
            case 7:
                m(mUSValue);
                return true;
            case '\b':
                a(4, mUSValue);
                return true;
            case '\t':
                a(0, mUSValue);
                return true;
            case '\n':
                a(1, mUSValue);
                return true;
            case 11:
                a(2, mUSValue);
                return true;
            case '\f':
                a(3, mUSValue);
                return true;
            case '\r':
                b(4, mUSValue);
                return true;
            case 14:
                b(0, mUSValue);
                return true;
            case 15:
                b(1, mUSValue);
                return true;
            case 16:
                b(2, mUSValue);
                return true;
            case 17:
                b(3, mUSValue);
                return true;
            case 18:
                c(4, mUSValue);
                return true;
            case 19:
                c(0, mUSValue);
                return true;
            case 20:
                c(1, mUSValue);
                return true;
            case 21:
                c(2, mUSValue);
                return true;
            case 22:
                c(3, mUSValue);
                return true;
            case 23:
                d(4, mUSValue);
                return true;
            case 24:
                d(0, mUSValue);
                return true;
            case 25:
                d(1, mUSValue);
                return true;
            case 26:
                d(2, mUSValue);
                return true;
            case 27:
                d(3, mUSValue);
                return true;
            case 28:
                a(mUSValue);
                return true;
            case 29:
                b(mUSValue);
                return true;
            case 30:
                e(mUSValue);
                return true;
            case 31:
                f(mUSValue);
                return true;
            case ' ':
                g(mUSValue);
                return true;
            case '!':
                h(mUSValue);
                return true;
            case '\"':
                i(mUSValue);
                return true;
            case '#':
                j(mUSValue);
                return true;
            case '$':
                k(mUSValue);
                return true;
            case '%':
            case '&':
            case '\'':
                return true;
            default:
                return false;
        }
    }

    private void a(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42efcb15", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().b("");
        } else {
            this.f16128a.getNodeInfo().b(mUSValue.getStringValue());
        }
    }

    private void b(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42796516", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().b(false);
        } else {
            this.f16128a.getNodeInfo().b(mUSValue.getBoolValue());
        }
    }

    private void c(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4202ff17", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().a((jwx) null);
        } else {
            this.f16128a.getNodeInfo().a(com.taobao.android.weex_uikit.util.b.a(mUSValue));
        }
    }

    private void d(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418c9918", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().b((jwx) null);
        } else {
            this.f16128a.getNodeInfo().b(new jwx(com.taobao.android.weex_uikit.util.b.a(mUSValue.getStringValue())));
        }
    }

    private void e(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41163319", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().l(null);
        } else {
            this.f16128a.getNodeInfo().l(mUSValue.getStringValue());
        }
    }

    private void f(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409fcd1a", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().c((String) null);
        } else {
            this.f16128a.getNodeInfo().c(mUSValue.getStringValue());
        }
    }

    private void g(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4029671b", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().d((String) null);
        } else {
            this.f16128a.getNodeInfo().d(mUSValue.getStringValue());
        }
    }

    private void h(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb3011c", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().e((String) null);
        } else {
            this.f16128a.getNodeInfo().e(mUSValue.getStringValue());
        }
    }

    private void i(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3c9b1d", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().f(null);
        } else {
            this.f16128a.getNodeInfo().f(mUSValue.getStringValue());
        }
    }

    private void j(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec6351e", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().g(null);
        } else {
            this.f16128a.getNodeInfo().g(mUSValue.getStringValue());
        }
    }

    private void k(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e4fcf1f", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().h(null);
        } else {
            this.f16128a.getNodeInfo().h(mUSValue.getStringValue());
        }
    }

    private void l(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd96920", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().a(1.0f);
        } else {
            this.f16128a.getNodeInfo().a(Math.max(0.0f, Math.min(1.0f, mUSValue.convertToFloat())));
        }
    }

    private void m(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d630321", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().b(0, 0, 0, 0);
        } else {
            int a2 = com.taobao.android.weex_framework.util.k.a(mUSValue.convertToFloat());
            this.f16128a.getNodeInfo().b(a2, a2, a2, a2);
        }
    }

    private void n(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cec9d22", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().a(0);
        } else {
            this.f16128a.getNodeInfo().a(com.taobao.android.weex_framework.util.k.a(mUSValue.convertToFloat()));
        }
    }

    private void o(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c763723", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().b(0);
        } else {
            this.f16128a.getNodeInfo().b(com.taobao.android.weex_framework.util.k.a(mUSValue.convertToFloat()));
        }
    }

    private void p(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bffd124", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().c(0);
        } else {
            this.f16128a.getNodeInfo().c(com.taobao.android.weex_framework.util.k.a(mUSValue.convertToFloat()));
        }
    }

    private void q(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b896b25", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().d(0);
        } else {
            this.f16128a.getNodeInfo().d(com.taobao.android.weex_framework.util.k.a(mUSValue.convertToFloat()));
        }
    }

    private void a(int i, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cd31c8", new Object[]{this, new Integer(i), mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().a(true).a(i);
        } else {
            this.f16128a.getNodeInfo().a(true).a(i, com.taobao.android.weex_framework.util.k.a(mUSValue.convertToFloat()));
        }
    }

    private void b(int i, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        int i2 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a776d7e7", new Object[]{this, new Integer(i), mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().a(true).d(i);
        } else {
            String stringValue = mUSValue.getStringValue();
            char c = 65535;
            int hashCode = stringValue.hashCode();
            if (hashCode != -1338941519) {
                if (hashCode == -1325970902 && stringValue.equals("dotted")) {
                    c = 1;
                }
            } else if (stringValue.equals("dashed")) {
                c = 0;
            }
            if (c != 0) {
                i2 = c != 1 ? 0 : 1;
            }
            this.f16128a.getNodeInfo().a(true).b(i, i2);
        }
    }

    private void c(int i, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99207e06", new Object[]{this, new Integer(i), mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().a(true).f(i);
        } else {
            this.f16128a.getNodeInfo().a(true).c(i, com.taobao.android.weex_uikit.util.b.a(mUSValue.getStringValue()));
        }
    }

    private void d(int i, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aca2425", new Object[]{this, new Integer(i), mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f16128a.getNodeInfo().a(true).g(i);
        } else {
            this.f16128a.getNodeInfo().a(true).d(i, com.taobao.android.weex_framework.util.k.a(com.taobao.android.weex_framework.util.i.a(mUSValue)));
        }
    }
}
