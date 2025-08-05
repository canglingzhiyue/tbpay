package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.model.d;
import tb.fmd;

/* loaded from: classes5.dex */
public class fiu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private fmd f27983a;
    private b b;
    private fja c;
    private d d;
    private int e;
    private int f;
    private int g;
    private int h;
    private float i;
    private float j;
    private boolean k;
    private a l = new a();

    static {
        kge.a(-83078648);
    }

    public static /* synthetic */ float a(fiu fiuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e8a11176", new Object[]{fiuVar})).floatValue() : fiuVar.j;
    }

    public static /* synthetic */ float a(fiu fiuVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b8186ea", new Object[]{fiuVar, new Float(f)})).floatValue();
        }
        fiuVar.j = f;
        return f;
    }

    public static /* synthetic */ int a(fiu fiuVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b819230", new Object[]{fiuVar, new Integer(i)})).intValue();
        }
        fiuVar.h = i;
        return i;
    }

    public static /* synthetic */ boolean a(fiu fiuVar, fmd.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4646169f", new Object[]{fiuVar, bVar})).booleanValue() : fiuVar.a(bVar);
    }

    public static /* synthetic */ boolean a(fiu fiuVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b81d212", new Object[]{fiuVar, new Boolean(z)})).booleanValue();
        }
        fiuVar.k = z;
        return z;
    }

    public static /* synthetic */ float b(fiu fiuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d72417f7", new Object[]{fiuVar})).floatValue() : fiuVar.i;
    }

    public static /* synthetic */ float b(fiu fiuVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5f5089", new Object[]{fiuVar, new Float(f)})).floatValue();
        }
        fiuVar.i = f;
        return f;
    }

    public static /* synthetic */ int b(fiu fiuVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5f5bcf", new Object[]{fiuVar, new Integer(i)})).intValue();
        }
        fiuVar.e = i;
        return i;
    }

    public static /* synthetic */ int c(fiu fiuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5a71e7b", new Object[]{fiuVar})).intValue() : fiuVar.f;
    }

    public static /* synthetic */ int c(fiu fiuVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef3d256e", new Object[]{fiuVar, new Integer(i)})).intValue();
        }
        fiuVar.f = i;
        return i;
    }

    public static /* synthetic */ int d(fiu fiuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b42a24fc", new Object[]{fiuVar})).intValue() : fiuVar.g;
    }

    public static /* synthetic */ int d(fiu fiuVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d11aef0d", new Object[]{fiuVar, new Integer(i)})).intValue();
        }
        fiuVar.g = i;
        return i;
    }

    public static /* synthetic */ int e(fiu fiuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a2ad2b7d", new Object[]{fiuVar})).intValue() : fiuVar.h;
    }

    public static /* synthetic */ int f(fiu fiuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("913031fe", new Object[]{fiuVar})).intValue() : fiuVar.e;
    }

    public static /* synthetic */ fja g(fiu fiuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fja) ipChange.ipc$dispatch("a56a9ffd", new Object[]{fiuVar}) : fiuVar.c;
    }

    public static /* synthetic */ String h(fiu fiuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2fd21133", new Object[]{fiuVar}) : fiuVar.b();
    }

    public static /* synthetic */ d i(fiu fiuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("48b0f19e", new Object[]{fiuVar}) : fiuVar.d;
    }

    public static /* synthetic */ b j(fiu fiuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4aa6eabe", new Object[]{fiuVar}) : fiuVar.b;
    }

    public static /* synthetic */ boolean k(fiu fiuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39bf5294", new Object[]{fiuVar})).booleanValue() : fiuVar.k;
    }

    public fiu(fmd fmdVar, b bVar) {
        this.f27983a = fmdVar;
        this.b = bVar;
        a();
        this.f27983a.a(this.l);
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a363f7be", new Object[]{this, dVar});
        } else {
            this.d = dVar;
        }
    }

    public void a(fiy fiyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a2e302", new Object[]{this, fiyVar});
        } else if (!(fiyVar instanceof fja)) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "updatePlayer失败，非VideoPlayer类型");
        } else {
            this.c = (fja) fiyVar;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f27983a.a(new fmd.c() { // from class: tb.fiu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.fmd.c
                public void a(fmd.b bVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fa0ebefd", new Object[]{this, bVar});
                    } else if (!fiu.a(fiu.this, bVar)) {
                    } else {
                        float b = (bVar.d - fiu.b(fiu.this)) / (fiu.a(fiu.this) - fiu.b(fiu.this));
                        int d = (int) (fiu.d(fiu.this) - ((fiu.d(fiu.this) - fiu.e(fiu.this)) * b));
                        int f = (int) (fiu.f(fiu.this) - ((fiu.f(fiu.this) - fiu.c(fiu.this)) * b));
                        fiu.g(fiu.this).a(d, f);
                        fjt.a(fjt.TAG_VIDEO_ZOOM, "页面：" + fiu.h(fiu.this) + " " + fiu.i(fiu.this).f + "调整height: " + d + ", marginTop: " + f + ", ratio: " + b);
                    }
                }

                @Override // tb.fmd.c
                public void a(String str, fmd.b bVar) {
                    com.taobao.android.detail2.core.framework.base.media.frame.a f;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e932ea47", new Object[]{this, str, bVar});
                    } else if (!fiu.a(fiu.this, bVar) || (f = fiu.g(fiu.this).f()) == null) {
                    } else {
                        if (IAKPopRender.LifecycleType.IN_ANIMATION_START.equals(str)) {
                            fiu.b(fiu.this, bVar.f28059a);
                            fiu.a(fiu.this, bVar.b);
                            fiu.b(fiu.this, f.e);
                            fiu fiuVar = fiu.this;
                            fiu.c(fiuVar, fmt.c(fiu.j(fiuVar).g()));
                            fiu.d(fiu.this, f.c);
                            fiu.a(fiu.this, ((int) bVar.b) - fmt.c(fiu.j(fiu.this).g()));
                            fjt.a(fjt.TAG_VIDEO_ZOOM, "页面：" + fiu.h(fiu.this) + " " + fiu.i(fiu.this).f + "IN_ANIMATION_START, popStartY: " + bVar.f28059a + ", popEndY: " + bVar.b + ", videoStartMarginTop: " + fiu.f(fiu.this) + ", videoEndMarginTop: " + fiu.c(fiu.this) + ", videoStartHeight: " + fiu.d(fiu.this) + ", videoEndHeight: " + fiu.e(fiu.this));
                        } else if (IAKPopRender.LifecycleType.PAN_ANIMATION_RECOVER_START.equals(str)) {
                            if (bVar.b > bVar.f28059a) {
                                fiu.a(fiu.this, true);
                            } else {
                                fiu.a(fiu.this, false);
                            }
                            fjt.a(fjt.TAG_VIDEO_ZOOM, "页面：" + fiu.h(fiu.this) + " " + fiu.i(fiu.this).f + str + ", position.startY: " + bVar.f28059a + ", position.endY: " + bVar.b);
                        } else if (IAKPopRender.LifecycleType.IN_ANIMATION_END.equals(str)) {
                            fjt.a(fjt.TAG_VIDEO_ZOOM, "页面：" + fiu.h(fiu.this) + " " + fiu.i(fiu.this).f + str + ", videoEndMarginTop: " + fiu.c(fiu.this) + ", videoEndHeight: " + fiu.e(fiu.this));
                            fiu.g(fiu.this).a(fiu.e(fiu.this), fiu.c(fiu.this));
                        } else if (IAKPopRender.LifecycleType.PAN_ANIMATION_RECOVER_END.equals(str)) {
                            if (fiu.k(fiu.this)) {
                                return;
                            }
                            fiu.g(fiu.this).a(fiu.e(fiu.this), fiu.c(fiu.this));
                            fjt.a(fjt.TAG_VIDEO_ZOOM, "页面：" + fiu.h(fiu.this) + " " + fiu.i(fiu.this).f + str + ", videoEndMarginTop: " + fiu.c(fiu.this) + ", videoEndHeight: " + fiu.e(fiu.this));
                        } else if (!IAKPopRender.LifecycleType.BEFORE_CLOSE.equals(str)) {
                        } else {
                            fjt.a(fjt.TAG_VIDEO_ZOOM, "页面：" + fiu.h(fiu.this) + " " + fiu.i(fiu.this).f + str + ", size.showMarginTop: " + f.e + ", size.showHeight: " + f.c);
                            fiu.g(fiu.this).a(f.c, f.e);
                        }
                    }
                }
            });
        }
    }

    private boolean a(fmd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa0ebf01", new Object[]{this, bVar})).booleanValue();
        }
        if (bVar == null) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "页面：" + b() + " position为空,不响应");
            return false;
        }
        d d = this.f27983a.d();
        if (d == null) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "页面：" + b() + " currentDisplayNode为空,不响应");
            return false;
        }
        d dVar = this.d;
        if (dVar == null) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "页面：" + b() + " mCurrentNode为空,不响应");
            return false;
        } else if (!dVar.R()) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "页面：" + b() + " 开关关闭,不响应");
            return false;
        } else if (this.d.f != d.f) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "页面：" + b() + " currentIndex: " + this.d.f + "displayIndex: " + d.f + "不匹配, 不响应");
            return false;
        } else if (this.c != null) {
            return true;
        } else {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "页面：" + b() + "播放器为空, 不响应");
            return false;
        }
    }

    private String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b.h().y();
    }

    /* loaded from: classes5.dex */
    public class a implements fmd.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(663233378);
            kge.a(-37335218);
        }

        private a() {
        }

        @Override // tb.fmd.d
        public void a(int i, int i2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2619b90c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            } else if (fiu.g(fiu.this) == null) {
            } else {
                fiu.g(fiu.this).k();
            }
        }
    }
}
