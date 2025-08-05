package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.a;
import com.taobao.android.detail2.core.framework.base.weex.i;
import com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class mvl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private NewDetailMaskFrameLayout f31283a;
    private boolean b;
    private boolean c;
    private int d;
    private MUSDKInstance e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;

    static {
        kge.a(595048781);
    }

    public static /* synthetic */ boolean a(mvl mvlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f5461819", new Object[]{mvlVar})).booleanValue() : mvlVar.b;
    }

    public static /* synthetic */ int b(mvl mvlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e3c91e89", new Object[]{mvlVar})).intValue() : mvlVar.d;
    }

    public static /* synthetic */ int c(mvl mvlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d24c250a", new Object[]{mvlVar})).intValue() : mvlVar.f;
    }

    public static /* synthetic */ int d(mvl mvlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c0cf2b8b", new Object[]{mvlVar})).intValue() : mvlVar.g;
    }

    public static /* synthetic */ int e(mvl mvlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("af52320c", new Object[]{mvlVar})).intValue() : mvlVar.h;
    }

    public static /* synthetic */ int f(mvl mvlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9dd5388d", new Object[]{mvlVar})).intValue() : mvlVar.i;
    }

    public static /* synthetic */ boolean g(mvl mvlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8c583f1f", new Object[]{mvlVar})).booleanValue() : mvlVar.c;
    }

    public static /* synthetic */ boolean h(mvl mvlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7adb45a0", new Object[]{mvlVar})).booleanValue() : mvlVar.l;
    }

    public static /* synthetic */ MUSDKInstance i(mvl mvlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSDKInstance) ipChange.ipc$dispatch("d9f66bc3", new Object[]{mvlVar}) : mvlVar.e;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b = false;
        }
    }

    public void a(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13e9f77", new Object[]{this, activity, intent});
            return;
        }
        if (intent != null && intent.getBooleanExtra("realHitMaskFrameAnim", false)) {
            try {
                activity.setTheme(R.style.Theme_NewDetailMainPage_Transparent);
                this.b = true;
                this.f = NewDetailMaskFrameLayout.getAdapterSpeedFromIntent(intent);
            } catch (Throwable th) {
                fjt.a(fjt.TAG_FAST_ANIM, "未知异常。setTheme 失败。自动降级.", th);
            }
        }
        if (intent != null && intent.getBooleanExtra("onNavHitPreCacheData", false)) {
            this.j = true;
        }
        if (intent == null || !intent.getBooleanExtra("extraEnableTraStyleData", false)) {
            return;
        }
        this.k = true;
    }

    public NewDetailMaskFrameLayout c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NewDetailMaskFrameLayout) ipChange.ipc$dispatch("4a885fd7", new Object[]{this}) : this.f31283a;
    }

    public void d() {
        NewDetailMaskFrameLayout newDetailMaskFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.b || (newDetailMaskFrameLayout = this.f31283a) == null) {
        } else {
            newDetailMaskFrameLayout.onFinish();
        }
    }

    public void e() {
        NewDetailMaskFrameLayout newDetailMaskFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.b || (newDetailMaskFrameLayout = this.f31283a) == null) {
        } else {
            newDetailMaskFrameLayout.destroy();
        }
    }

    public void a(Activity activity, NewDetailMaskFrameLayout newDetailMaskFrameLayout, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        final boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896d9c86", new Object[]{this, activity, newDetailMaskFrameLayout, frameLayout});
            return;
        }
        this.f31283a = newDetailMaskFrameLayout;
        int deviceScore = NewDetailMaskFrameLayout.getDeviceScore();
        this.d = fkt.a(deviceScore);
        this.g = fkt.b(deviceScore);
        if (qxo.a()) {
            this.d = (int) (this.d * 1.5f);
            this.g = (int) (this.g * 1.5f);
        }
        this.h = fkt.aH();
        this.i = fkt.aI();
        this.e = i.a();
        activity.overridePendingTransition(0, 0);
        fjt.a(fjt.TAG_FAST_ANIM, "OnCreate mHasHitWeexOpenImmediatelyPreSendData");
        this.c = fkt.aw();
        this.l = ipa.bp();
        if (!this.k || this.j) {
            z = false;
        }
        this.f31283a.setMaskFrameLayoutHandler(new NewDetailMaskFrameLayout.c() { // from class: tb.mvl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 66980178) {
                    return new Boolean(super.G());
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : fjt.TAG_FAST_ANIM;
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean f() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
                }
                return false;
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean g() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
                }
                return false;
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean i() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean t() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public int x() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("6b088f2", new Object[]{this})).intValue();
                }
                return 201;
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else {
                    fjt.a(str, str2);
                }
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public void a(String str, String str2, Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
                } else {
                    fjt.a(str, str2, th);
                }
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean G() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue();
                }
                if (!z) {
                    return super.G();
                }
                return true;
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : mvl.a(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public int c() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : mvl.b(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public int p() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("63fccea", new Object[]{this})).intValue() : mvl.c(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public int q() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("64de46b", new Object[]{this})).intValue() : mvl.d(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public int r() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("65bfbec", new Object[]{this})).intValue() : mvl.e(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public int s() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("66a136d", new Object[]{this})).intValue() : mvl.f(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean d() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : mvl.g(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean H() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : mvl.h(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public void e() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a4ca6c", new Object[]{this});
                } else if (mvl.i(mvl.this) == null) {
                } else {
                    mvl.i(mvl.this).onViewDisappear();
                }
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public void h() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cf10ef", new Object[]{this});
                } else if (mvl.i(mvl.this) == null) {
                } else {
                    mvl.i(mvl.this).onViewAppear();
                }
            }
        });
        this.f31283a.setParentFrameLayout(frameLayout);
        this.b = this.f31283a.initAnim();
        if (this.b) {
            return;
        }
        try {
            NewDetailMaskFrameLayout.degradeToOldTransition(activity, R.anim.push_left_in, R.anim.push_left_out);
        } catch (Throwable th) {
            fjt.a(fjt.TAG_FAST_ANIM, "大概率动画资源不存在，动画降级失败。", th);
        }
    }

    public void a(Activity activity, a aVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        final boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873140e6", new Object[]{this, activity, aVar});
            return;
        }
        this.f31283a = (NewDetailMaskFrameLayout) activity.findViewById(R.id.rootAnimFrameLayout);
        if (this.f31283a == null) {
            fjt.a(fjt.TAG_FAST_ANIM, "setContentViewForMaskFrameLayout mNewDetailMaskFrameLayout is null.");
            this.b = false;
            aVar.finishNewDetailContainer();
            return;
        }
        int deviceScore = NewDetailMaskFrameLayout.getDeviceScore();
        this.d = fkt.a(deviceScore);
        this.g = fkt.b(deviceScore);
        if (qxo.a()) {
            this.d = (int) (this.d * 1.5f);
            this.g = (int) (this.g * 1.5f);
        }
        this.h = fkt.aH();
        this.i = fkt.aI();
        this.e = i.a();
        activity.overridePendingTransition(0, 0);
        fjt.a(fjt.TAG_FAST_ANIM, "OnCreate mHasHitWeexOpenImmediatelyPreSendData");
        this.c = fkt.aw();
        this.l = ipa.bp();
        Intent intent = activity.getIntent();
        final int i = (intent == null || (data = intent.getData()) == null) ? false : fme.EXP_ITEM_ARTICLE.equals(data.getQueryParameter(fky.SP_KEY_ENTRY_EXP)) ? 201 : 101;
        if (!this.k || this.j) {
            z = false;
        }
        this.f31283a.setMaskFrameLayoutHandler(new NewDetailMaskFrameLayout.c() { // from class: tb.mvl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == 66980178) {
                    return new Boolean(super.G());
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : fjt.TAG_FAST_ANIM;
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean f() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
                }
                return false;
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean g() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
                }
                return false;
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean i() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean t() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else {
                    fjt.a(str, str2);
                }
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public void a(String str, String str2, Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
                } else {
                    fjt.a(str, str2, th);
                }
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean G() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue();
                }
                if (!z) {
                    return super.G();
                }
                return true;
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : mvl.a(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public int c() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : mvl.b(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public int x() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6b088f2", new Object[]{this})).intValue() : i;
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public int p() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("63fccea", new Object[]{this})).intValue() : mvl.c(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public int q() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("64de46b", new Object[]{this})).intValue() : mvl.d(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public int r() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("65bfbec", new Object[]{this})).intValue() : mvl.e(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public int s() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("66a136d", new Object[]{this})).intValue() : mvl.f(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean d() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : mvl.g(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public boolean H() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : mvl.h(mvl.this);
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public void e() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a4ca6c", new Object[]{this});
                } else if (mvl.i(mvl.this) == null) {
                } else {
                    mvl.i(mvl.this).onViewDisappear();
                }
            }

            @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.c
            public void h() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cf10ef", new Object[]{this});
                } else if (mvl.i(mvl.this) == null) {
                } else {
                    mvl.i(mvl.this).onViewAppear();
                }
            }
        });
        this.f31283a.setParentFrameLayout((FrameLayout) activity.findViewById(R.id.rootParentFrameLayout));
        this.b = this.f31283a.initAnim();
        if (this.b) {
            return;
        }
        try {
            NewDetailMaskFrameLayout.degradeToOldTransition(activity, R.anim.push_left_in, R.anim.push_left_out);
        } catch (Throwable th) {
            fjt.a(fjt.TAG_FAST_ANIM, "大概率动画资源不存在，动画降级失败。", th);
        }
    }
}
