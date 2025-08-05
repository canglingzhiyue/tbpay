package com.taobao.android.detail2.core.framework.view.manager;

import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.secondpage.SecondPageFactory;
import com.taobao.android.detail2.core.framework.secondpage.a;
import com.taobao.android.detail2.core.framework.view.horizontalscroll.NewDetailViewPager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.fjt;
import tb.kge;
import tb.qxo;

/* loaded from: classes5.dex */
public class a extends ViewPager.SimpleOnPageChangeListener implements ViewPager.OnPageChangeListener, ViewPager.PageTransformer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_TYPE_NEW_DETAIL = "NewDetail";
    public static final String PAGE_TYPE_SECOND_PAGE = "SecondPage";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, SecondPageFactory.SecondPageType> f11623a;
    private com.taobao.android.detail2.core.framework.b b;
    private View c;
    private NewDetailViewPager d;
    private com.taobao.android.detail2.core.framework.view.horizontalscroll.a e;
    private SecondPageFactory f;
    private com.taobao.android.detail2.core.framework.secondpage.a g;
    private FrameLayout h;
    private boolean i;
    private boolean j;
    private InterfaceC0465a k;

    /* renamed from: com.taobao.android.detail2.core.framework.view.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0465a {
        void a();

        void a(boolean z);

        void b();

        void b(boolean z);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1064878849);
        kge.a(941956907);
        kge.a(1848919473);
        HashMap hashMap = new HashMap();
        f11623a = hashMap;
        hashMap.put("person", SecondPageFactory.SecondPageType.GG_PROFILE);
    }

    public a(com.taobao.android.detail2.core.framework.b bVar, View view) {
        this.b = bVar;
        this.c = view;
        this.f = new SecondPageFactory(bVar.g());
        h();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.b.g() == null) {
        } else {
            fjt.a(fjt.TAG_SECOND_PAGE, "初始化页面水平滑动视图");
            this.d = new NewDetailViewPager(this.b.g());
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.c);
            this.h = new FrameLayout(this.b.g());
            this.h.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.h.setBackgroundColor(-1);
            arrayList.add(this.h);
            this.e = new com.taobao.android.detail2.core.framework.view.horizontalscroll.a(arrayList);
            this.d.setAdapter(this.e);
            this.d.setPageTransformer(false, this);
            this.d.addOnPageChangeListener(this);
            i();
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.c.getParent();
        viewGroup.removeView(this.c);
        viewGroup.addView(this.d, 0);
    }

    @Override // android.support.v4.view.ViewPager.PageTransformer
    public void transformPage(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6a8f50", new Object[]{this, view, new Float(f)});
        } else if (view != this.e.a(0)) {
        } else {
            if (f <= -1.0f) {
                view.setVisibility(4);
            } else if (f <= 0.0f) {
                view.setVisibility(0);
            }
            view.setTranslationX(view.getWidth() * f * (-0.8f));
        }
    }

    @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (this.k == null) {
            if (qxo.a()) {
                throw new NullPointerException("mHorizontalScrollListener 不存在。 mHorizontalScrollListener is null");
            }
            fjt.a(fjt.TAG_TIP, "mHorizontalScrollListener 不存在。 mHorizontalScrollListener is null");
        } else if (i == 1) {
            if (this.d.getCurrentItem() == 0) {
                this.k.a();
            } else if (this.d.getCurrentItem() == 1) {
                this.k.b();
            }
            this.i = true;
            this.j = false;
        } else if (i == 2) {
            this.j = true;
        } else if (i != 0) {
        } else {
            if (this.d.getCurrentItem() == 0) {
                if (!this.i) {
                    this.k.b();
                }
                this.k.a(this.j);
            } else if (this.d.getCurrentItem() == 1) {
                if (!this.i) {
                    this.k.a();
                }
                this.k.b(this.j);
            }
            this.i = false;
            this.j = false;
        }
    }

    public void a(boolean z, String str, String str2) {
        com.taobao.android.detail2.core.framework.secondpage.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da24c280", new Object[]{this, new Boolean(z), str, str2});
            return;
        }
        fjt.a(fjt.TAG_SECOND_PAGE, "处理左滑打开二级页，是否可用" + z + "，二级页类型" + str + "，二级页URL" + str2);
        if (!TextUtils.isEmpty(str)) {
            this.g = this.f.a(f11623a.get(str));
        }
        if (z && (aVar = this.g) != null && aVar.a() != null && !TextUtils.isEmpty(str2)) {
            NewDetailViewPager newDetailViewPager = this.d;
            newDetailViewPager.setViewPagerFeature(this.g.a(newDetailViewPager));
            this.d.setIsAvailable(true);
            if (this.g.a().getParent() == null) {
                this.h.removeAllViews();
                this.h.addView(this.g.a());
            } else if (this.g.a().getParent() != this.h) {
                ((ViewGroup) this.g.a().getParent()).removeView(this.g.a());
                this.h.removeAllViews();
                this.h.addView(this.g.a());
            }
            this.g.a(Uri.parse(str2));
            if (this.g.j() != null) {
                return;
            }
            this.g.a(new a.InterfaceC0462a() { // from class: com.taobao.android.detail2.core.framework.view.manager.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail2.core.framework.secondpage.a.InterfaceC0462a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        a.this.b();
                    }
                }
            });
            return;
        }
        this.d.setIsAvailable(false);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        NewDetailViewPager newDetailViewPager = this.d;
        String str = (newDetailViewPager == null || newDetailViewPager.getCurrentItem() != 1) ? "NewDetail" : PAGE_TYPE_SECOND_PAGE;
        fjt.a(fjt.TAG_SECOND_PAGE, "获取当前的页面类型" + str);
        return str;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        NewDetailViewPager newDetailViewPager = this.d;
        if (newDetailViewPager == null || newDetailViewPager.getCurrentItem() != 1) {
            return;
        }
        fjt.a(fjt.TAG_SECOND_PAGE, "当前位于二级页，从二级页返回");
        this.d.setCurrentItem(0);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.secondpage.a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.secondpage.a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.f();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.secondpage.a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.d();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.secondpage.a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.e();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.secondpage.a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    public void a(InterfaceC0465a interfaceC0465a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd9e025", new Object[]{this, interfaceC0465a});
        } else {
            this.k = interfaceC0465a;
        }
    }
}
