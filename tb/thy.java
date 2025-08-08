package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.helper.ItemTouchHelper;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.autosize.h;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.f;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.PanelStyleModel;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.List;

/* loaded from: classes8.dex */
public class thy implements View.OnTouchListener, a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f34105a;
    private PanelStyleModel b;
    private final int c = 4;
    private thx d;
    private StaggeredGridLayoutManager e;

    /* renamed from: tb.thy$2  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34107a = new int[WindowType.values().length];

        static {
            try {
                f34107a[WindowType.MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34107a[WindowType.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34107a[WindowType.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34107a[WindowType.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34107a[WindowType.MAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        kge.a(-928045822);
        kge.a(1717401112);
        kge.a(-468432129);
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        }
    }

    public thy(a aVar) {
        this.f34105a = aVar;
    }

    public View a(JSONObject jSONObject, PanelStyleModel panelStyleModel, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ea471d4e", new Object[]{this, jSONObject, panelStyleModel, context, new Integer(i)});
        }
        this.b = panelStyleModel;
        ViewGroup a2 = a(context);
        a2.addView(b(context));
        a2.addView(a(context, b.a(jSONObject, i)));
        return a2;
    }

    private ViewGroup a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d01cc9b5", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setColor(Color.parseColor(this.b.panelBgColor));
        float a2 = f.a(context, 6.0f);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, a2, a2, a2, a2});
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setLongClickable(false);
        frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.thy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                return true;
            }
        });
        return frameLayout;
    }

    private View b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c13a4681", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, f.a(context, this.b.panelGradientHeight));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setColors(new int[]{Color.parseColor(this.b.panelGradientStartBgColor), Color.parseColor(this.b.panelBgColor)});
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(gradientDrawable);
        return frameLayout;
    }

    private View a(Context context, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("91d47753", new Object[]{this, context, list});
        }
        TRecyclerView tRecyclerView = new TRecyclerView(context);
        tRecyclerView.setOnTouchListener(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int a2 = f.a(context, 8.0f);
        int a3 = f.a(context, 8.0f);
        layoutParams.leftMargin = a2;
        layoutParams.rightMargin = a3;
        layoutParams.bottomMargin = f.a(context, 24.0f);
        layoutParams.gravity = 17;
        tRecyclerView.setLayoutParams(layoutParams);
        this.e = new StaggeredGridLayoutManager(a(this.b.columnConfig, context), 1);
        tRecyclerView.setLayoutManager(this.e);
        this.d = new thx(this.f34105a);
        tRecyclerView.setAdapter(this.d);
        this.d.a(list, this.b);
        new ItemTouchHelper(new thu(this.d)).attachToRecyclerView(tRecyclerView);
        return tRecyclerView;
    }

    public int[] a(String str) {
        thx thxVar;
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("81233af2", new Object[]{this, str});
        }
        int[] iArr = new int[2];
        if (StringUtils.isEmpty(str) || (thxVar = this.d) == null) {
            return iArr;
        }
        int c = thxVar.c(str);
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.e;
        if (staggeredGridLayoutManager == null || (findViewByPosition = staggeredGridLayoutManager.findViewByPosition(c)) == null) {
            return iArr;
        }
        findViewByPosition.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], findViewByPosition.getWidth(), findViewByPosition.getHeight()};
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        thx thxVar = this.d;
        if (thxVar == null) {
            return;
        }
        thxVar.a();
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        thx thxVar = this.d;
        if (thxVar == null) {
            return;
        }
        thxVar.b();
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        thx thxVar = this.d;
        if (thxVar != null) {
            return thxVar.c();
        }
        return false;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        g.a("PanelCategoryViewProvider", "onClose mAdapter onClose:");
        thx thxVar = this.d;
        if (thxVar == null) {
            return;
        }
        thxVar.d();
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.d.e();
    }

    private int a(String str, Context context) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6e7fbc9", new Object[]{this, str, context})).intValue();
        }
        int i2 = 4;
        if ((!com.taobao.homepage.utils.b.c() && !com.taobao.homepage.utils.b.b()) || StringUtils.isEmpty(str)) {
            return 4;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (!(context instanceof Activity)) {
                return 4;
            }
            int i3 = AnonymousClass2.f34107a[h.a().b((Activity) context).ordinal()];
            if (i3 == 1) {
                i = parseObject.getIntValue("min");
            } else if (i3 == 2) {
                i = parseObject.getIntValue("small");
            } else if (i3 == 3) {
                i = parseObject.getIntValue("medium");
            } else if (i3 == 4) {
                i = parseObject.getIntValue("large");
            } else if (i3 == 5) {
                i = parseObject.getIntValue("max");
            }
            if (i > 0) {
                i2 = i;
            }
            g.a("PanelCategoryViewProvider", "getColumns columns:" + i2);
            return i2;
        } catch (Exception unused) {
            g.a("PanelCategoryViewProvider", "getColumns columnsData parse error");
            return 4;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        this.f34105a.i();
        return false;
    }
}
