package tb;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes4.dex */
public class ebt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SparseBooleanArray f27178a = new SparseBooleanArray();
    private SparseArray<Float> b = new SparseArray<>();
    private int c;
    private int d;
    private int e;
    private float f;
    private int g;
    private boolean h;
    private a i;

    /* loaded from: classes4.dex */
    public interface a {
        void onDeselected(int i, int i2);

        void onEnter(int i, int i2, float f, boolean z);

        void onLeave(int i, int i2, float f, boolean z);

        void onSelected(int i, int i2);
    }

    static {
        kge.a(1305703483);
    }

    public ebt() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.helper.NavigatorHelper");
    }

    public void a(int i, float f, int i2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26181c1e", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (f >= 0.0f && f <= 1.0f) {
            float f2 = i + f;
            boolean z2 = this.f <= f2;
            if (this.g != 0) {
                if (f2 == this.f) {
                    return;
                }
                int i3 = i + 1;
                if (f != 0.0f || !z2) {
                    z = true;
                } else {
                    i3 = i - 1;
                    z = false;
                }
                for (int i4 = 0; i4 < this.c; i4++) {
                    if (i4 != i && i4 != i3 && this.b.get(i4, Float.valueOf(0.0f)).floatValue() != 1.0f) {
                        b(i4, 1.0f, z2, true);
                    }
                }
                if (!z) {
                    float f3 = 1.0f - f;
                    b(i3, f3, true, false);
                    a(i, f3, true, false);
                } else if (z2) {
                    b(i, f, true, false);
                    a(i3, f, true, false);
                } else {
                    float f4 = 1.0f - f;
                    b(i3, f4, false, false);
                    a(i, f4, false, false);
                }
            } else {
                for (int i5 = 0; i5 < this.c; i5++) {
                    if (i5 != this.d) {
                        if (!this.f27178a.get(i5)) {
                            e(i5);
                        }
                        if (this.b.get(i5, Float.valueOf(0.0f)).floatValue() != 1.0f) {
                            b(i5, 1.0f, false, true);
                        }
                    }
                }
                a(this.d, 1.0f, false, true);
                d(this.d);
            }
            this.f = f2;
        }
    }

    public void a(int i, int i2, float f, int i3, List<ebv> list) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2547dafc", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), list});
            return;
        }
        if (i > i2) {
            z = false;
        }
        ebv a2 = ebs.a(list, i);
        int abs = Math.abs(a2.f27179a - ebs.a(list, i2).f27179a);
        if (z) {
            int i4 = a2.f27179a + ((int) (f * abs));
            int i5 = 0;
            while (true) {
                if (i5 >= list.size()) {
                    i5 = 0;
                    break;
                }
                ebv a3 = ebs.a(list, i5);
                if (a3.f27179a < i4 && a3.c > i4) {
                    break;
                }
                i5++;
            }
            ebv a4 = ebs.a(list, i5);
            a(i5, ((i4 - a4.f27179a) * 1.0f) / (a4.c - a4.f27179a), i3);
            return;
        }
        int i6 = a2.f27179a - ((int) (f * abs));
        int i7 = 0;
        while (true) {
            if (i7 >= list.size()) {
                i7 = 0;
                break;
            }
            ebv a5 = ebs.a(list, i7);
            if (a5.f27179a < i6 && a5.c > i6) {
                break;
            }
            i7++;
        }
        ebv a6 = ebs.a(list, i7);
        a(i7, ((i6 - a6.c) * 1.0f) / (a6.c - a6.f27179a), i3);
    }

    private void a(int i, float f, boolean z, boolean z2) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf3d4c5", new Object[]{this, new Integer(i), new Float(f), new Boolean(z), new Boolean(z2)});
        } else if (!this.h && i != this.d && (i2 = this.g) != 1 && i2 != 2 && !z2) {
        } else {
            a aVar = this.i;
            if (aVar != null) {
                aVar.onEnter(i, this.c, f, z);
            }
            this.b.put(i, Float.valueOf(1.0f - f));
        }
    }

    private void b(int i, float f, boolean z, boolean z2) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("313843c6", new Object[]{this, new Integer(i), new Float(f), new Boolean(z), new Boolean(z2)});
            return;
        }
        if (!this.h && i != this.e && (i2 = this.g) != 1 && i2 != 2) {
            int i3 = this.d;
            if (((i != i3 - 1 && i != i3 + 1) || this.b.get(i, Float.valueOf(0.0f)).floatValue() == 1.0f) && !z2) {
                return;
            }
        }
        a aVar = this.i;
        if (aVar != null) {
            aVar.onLeave(i, this.c, f, z);
        }
        this.b.put(i, Float.valueOf(f));
    }

    private void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.i;
        if (aVar != null) {
            aVar.onSelected(i, this.c);
        }
        this.f27178a.put(i, false);
    }

    private void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.i;
        if (aVar != null) {
            aVar.onDeselected(i, this.c);
        }
        this.f27178a.put(i, true);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.e = this.d;
        this.d = i;
        d(this.d);
        for (int i2 = 0; i2 < this.c; i2++) {
            if (i2 != this.d && !this.f27178a.get(i2)) {
                e(i2);
            }
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67961be4", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.c;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        this.f27178a.clear();
        this.b.clear();
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.d;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.g;
    }
}
