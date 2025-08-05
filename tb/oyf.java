package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.object.ScancodeType;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public class oyf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static oyf f32480a;
    public static oyf b;
    private Set<ScancodeType> c = new LinkedHashSet();

    static {
        kge.a(1282078939);
        oyf oyfVar = new oyf();
        f32480a = oyfVar;
        oyfVar.b(ScancodeType.PRODUCT, ScancodeType.QR, ScancodeType.ANTI_FAKE, ScancodeType.EXPRESS, ScancodeType.MEDICINE, ScancodeType.TB_4G, ScancodeType.GEN3);
        oyf oyfVar2 = new oyf();
        b = oyfVar2;
        oyfVar2.b(ScancodeType.QR, ScancodeType.GEN3);
    }

    public void a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
        } else if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                try {
                    this.c.add(ScancodeType.valueOf(str.toUpperCase()));
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public void a(ScancodeType... scancodeTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7c33fa", new Object[]{this, scancodeTypeArr});
        } else if (scancodeTypeArr == null || scancodeTypeArr.length <= 0) {
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Collections.addAll(linkedHashSet, scancodeTypeArr);
            this.c.removeAll(linkedHashSet);
        }
    }

    public void b(ScancodeType... scancodeTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfbaa399", new Object[]{this, scancodeTypeArr});
        } else if (scancodeTypeArr == null || scancodeTypeArr.length <= 0) {
        } else {
            Collections.addAll(this.c, scancodeTypeArr);
        }
    }

    public boolean a(ScancodeType scancodeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1521dc39", new Object[]{this, scancodeType})).booleanValue();
        }
        if (scancodeType != null) {
            return this.c.contains(scancodeType);
        }
        return false;
    }

    public Set<ScancodeType> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this}) : this.c;
    }
}
