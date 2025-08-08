package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.QiangGouNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class fcf extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27790a;
    public String b;
    public String c;
    public long d;
    public String e;
    public float f;
    public String g;
    public QiangGouNode.Status h;

    static {
        kge.a(223278176);
    }

    public static /* synthetic */ Object ipc$super(fcf fcfVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public fcf(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        this.f27790a = "";
        this.b = "";
        a(bVar);
    }

    private void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        PriceNode m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c456302", new Object[]{this, bVar});
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewmodel.QiangGouPriceViewModel");
        if (this.mNodeBundle == null || (m = eqb.m(this.mNodeBundle)) == null) {
            return;
        }
        if (m.price != null) {
            String str = m.price.priceText;
            if (!StringUtils.isEmpty(str)) {
                this.f27790a = "¥" + a(str);
            }
        }
        if (m.extraPrices != null && !m.extraPrices.isEmpty()) {
            String str2 = m.extraPrices.get(m.extraPrices.size() - 1).priceText;
            if (!StringUtils.isEmpty(str2)) {
                this.b = "¥" + a(str2);
            }
        }
        this.h = QiangGouNode.Status.START;
        this.f = -1.0f;
        VerticalNode g = eqb.g(bVar);
        if (g == null || g.qiangGouNode == null) {
            return;
        }
        QiangGouNode qiangGouNode = g.qiangGouNode;
        this.c = qiangGouNode.soldText;
        this.d = qiangGouNode.endTime;
        this.e = "距结束";
        this.g = qiangGouNode.progressText;
        this.f = qiangGouNode.progress / 100.0f;
    }

    private String a(String str) {
        char charAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        int i = -1;
        for (int i2 = 0; i2 < str.length() && (((charAt = str.charAt(i2)) >= '0' && charAt <= '9') || charAt == '.'); i2++) {
            i = i2;
        }
        return i == -1 ? str : str.substring(0, i + 1).trim();
    }

    public fcf(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        this.f27790a = "";
        this.b = "";
        a(bVar);
    }
}
