package com.taobao.mytaobao.biztool;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.search.common.util.i;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.uc.webview.export.media.MessageID;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import tb.gbg;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\u0012\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0011H\u0014J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0006\u0010\u001e\u001a\u00020\u0011J\u0016\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/taobao/mytaobao/biztool/MtbToolEditActivity;", "Lcom/taobao/tao/BaseActivity;", "()V", "dstVHHeight", "", "dstVHWidth", "marketAdapter", "Lcom/taobao/mytaobao/biztool/ToolAdapter;", "myToolAdapter", "presenter", "Lcom/taobao/mytaobao/biztool/MtbToolEditPresenter;", "rvMarket", "Lcom/taobao/mytaobao/biztool/WrapContentRecyclerView;", "rvMyTool", "tvMarketTitle", "Landroid/widget/TextView;", "addTool", "", "dstPosition", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "isTranslucent", i.b.MEASURE_ONCREATE, "savedInstanceState", "Landroid/os/Bundle;", MessageID.onDestroy, "pageUT", "removeTool", "showErrorPage", "showPageData", "listMyTool", "Lcom/alibaba/fastjson/JSONArray;", "listMarket", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MtbToolEditActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.mytaobao.biztool.a f18359a;
    private WrapContentRecyclerView b;
    private c c;
    private WrapContentRecyclerView d;
    private c e;
    private TextView f;
    private int g;
    private int h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public b(View view) {
            this.b = view;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            MtbToolEditActivity.a(MtbToolEditActivity.this).f();
            this.b.setVisibility(8);
        }
    }

    static {
        kge.a(784404902);
    }

    public static /* synthetic */ Object ipc$super(MtbToolEditActivity mtbToolEditActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean isTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab05a0da", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public MtbToolEditActivity() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
        this.f18359a = new com.taobao.mytaobao.biztool.a();
    }

    public static final /* synthetic */ com.taobao.mytaobao.biztool.a a(MtbToolEditActivity mtbToolEditActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.biztool.a) ipChange.ipc$dispatch("d4b94ac9", new Object[]{mtbToolEditActivity}) : mtbToolEditActivity.f18359a;
    }

    public static final /* synthetic */ void a(MtbToolEditActivity mtbToolEditActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66e5670", new Object[]{mtbToolEditActivity, new Integer(i)});
        } else {
            mtbToolEditActivity.b(i);
        }
    }

    public static final /* synthetic */ c b(MtbToolEditActivity mtbToolEditActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("1cb8a966", new Object[]{mtbToolEditActivity});
        }
        c cVar = mtbToolEditActivity.c;
        if (cVar == null) {
            q.b("myToolAdapter");
        }
        return cVar;
    }

    public static final /* synthetic */ void b(MtbToolEditActivity mtbToolEditActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2abb1", new Object[]{mtbToolEditActivity, new Integer(i)});
        } else {
            mtbToolEditActivity.a(i);
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        SystemBarDecorator systemBarDecorator = new SystemBarDecorator(this);
        systemBarDecorator.enableImmersiveStatusBar(true);
        systemBarDecorator.setStatusBarColor((int) 4294178552L, false);
        setContentView(R.layout.activity_tool_edit);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.a("自定义");
        }
        if (supportActionBar != null) {
            supportActionBar.b(new ColorDrawable(Color.parseColor("#F3F6F8")));
        }
        this.f18359a.a(this);
        this.f18359a.f();
        MtbToolEditActivity mtbToolEditActivity = this;
        int b2 = gbg.b((Context) mtbToolEditActivity);
        this.g = (b2 * 232) / 750;
        this.h = (b2 * 264) / 750;
        View findViewById = findViewById(R.id.tvMarketTitle);
        q.a((Object) findViewById, "findViewById<TextView>(R.id.tvMarketTitle)");
        this.f = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.rvTool);
        q.a((Object) findViewById2, "findViewById<WrapContentRecyclerView>(R.id.rvTool)");
        this.b = (WrapContentRecyclerView) findViewById2;
        WrapContentRecyclerView wrapContentRecyclerView = this.b;
        if (wrapContentRecyclerView == null) {
            q.b("rvMyTool");
        }
        wrapContentRecyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(mtbToolEditActivity, 3);
        WrapContentRecyclerView wrapContentRecyclerView2 = this.b;
        if (wrapContentRecyclerView2 == null) {
            q.b("rvMyTool");
        }
        wrapContentRecyclerView2.setLayoutManager(gridLayoutManager);
        WrapContentRecyclerView wrapContentRecyclerView3 = this.b;
        if (wrapContentRecyclerView3 == null) {
            q.b("rvMyTool");
        }
        ViewGroup.LayoutParams layoutParams = wrapContentRecyclerView3.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins((b2 - (this.g * 3)) / 2, 0, 0, 0);
        WrapContentRecyclerView wrapContentRecyclerView4 = this.b;
        if (wrapContentRecyclerView4 == null) {
            q.b("rvMyTool");
        }
        wrapContentRecyclerView4.setLayoutParams(marginLayoutParams);
        this.c = new c(0, this.g, this.h);
        c cVar = this.c;
        if (cVar == null) {
            q.b("myToolAdapter");
        }
        cVar.setHasStableIds(true);
        c cVar2 = this.c;
        if (cVar2 == null) {
            q.b("myToolAdapter");
        }
        cVar2.a(new MtbToolEditActivity$onCreate$1(this));
        WrapContentRecyclerView wrapContentRecyclerView5 = this.b;
        if (wrapContentRecyclerView5 == null) {
            q.b("rvMyTool");
        }
        c cVar3 = this.c;
        if (cVar3 == null) {
            q.b("myToolAdapter");
        }
        wrapContentRecyclerView5.setAdapter(cVar3);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new a());
        WrapContentRecyclerView wrapContentRecyclerView6 = this.b;
        if (wrapContentRecyclerView6 == null) {
            q.b("rvMyTool");
        }
        itemTouchHelper.attachToRecyclerView(wrapContentRecyclerView6);
        WrapContentRecyclerView wrapContentRecyclerView7 = this.b;
        if (wrapContentRecyclerView7 == null) {
            q.b("rvMyTool");
        }
        wrapContentRecyclerView7.refreshHeight(this.h);
        View findViewById3 = findViewById(R.id.rvMarket);
        q.a((Object) findViewById3, "findViewById<WrapContent…yclerView>(R.id.rvMarket)");
        this.d = (WrapContentRecyclerView) findViewById3;
        WrapContentRecyclerView wrapContentRecyclerView8 = this.d;
        if (wrapContentRecyclerView8 == null) {
            q.b("rvMarket");
        }
        wrapContentRecyclerView8.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(mtbToolEditActivity, 3);
        WrapContentRecyclerView wrapContentRecyclerView9 = this.d;
        if (wrapContentRecyclerView9 == null) {
            q.b("rvMarket");
        }
        wrapContentRecyclerView9.setLayoutManager(gridLayoutManager2);
        WrapContentRecyclerView wrapContentRecyclerView10 = this.d;
        if (wrapContentRecyclerView10 == null) {
            q.b("rvMarket");
        }
        ViewGroup.LayoutParams layoutParams2 = wrapContentRecyclerView10.getLayoutParams();
        if (layoutParams2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins((b2 - (this.g * 3)) / 2, 0, 0, 0);
        WrapContentRecyclerView wrapContentRecyclerView11 = this.d;
        if (wrapContentRecyclerView11 == null) {
            q.b("rvMarket");
        }
        wrapContentRecyclerView11.setLayoutParams(marginLayoutParams2);
        this.e = new c(1, this.g, this.h);
        c cVar4 = this.e;
        if (cVar4 == null) {
            q.b("marketAdapter");
        }
        cVar4.setHasStableIds(true);
        c cVar5 = this.e;
        if (cVar5 == null) {
            q.b("marketAdapter");
        }
        cVar5.a(new MtbToolEditActivity$onCreate$2(this));
        WrapContentRecyclerView wrapContentRecyclerView12 = this.d;
        if (wrapContentRecyclerView12 == null) {
            q.b("rvMarket");
        }
        c cVar6 = this.e;
        if (cVar6 == null) {
            q.b("marketAdapter");
        }
        wrapContentRecyclerView12.setAdapter(cVar6);
        b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"com/taobao/mytaobao/biztool/MtbToolEditActivity$onCreate$itemTouchCallback$1", "Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;", "getMovementFlags", "", OrderConfigs.RECYCLERVIEW, "Landroid/support/v7/widget/RecyclerView;", "viewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "onMove", "", "target", "onSwiped", "", "direction", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a extends ItemTouchHelper.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed1ecf46", new Object[]{this, viewHolder, new Integer(i)});
            } else {
                q.c(viewHolder, "viewHolder");
            }
        }

        public a() {
        }

        @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("35ad4c09", new Object[]{this, recyclerView, viewHolder})).intValue();
            }
            q.c(recyclerView, "recyclerView");
            q.c(viewHolder, "viewHolder");
            if (((com.taobao.mytaobao.biztool.b) viewHolder).a()) {
                return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
            }
            return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
        }

        @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("16312429", new Object[]{this, recyclerView, viewHolder, target})).booleanValue();
            }
            q.c(recyclerView, "recyclerView");
            q.c(viewHolder, "viewHolder");
            q.c(target, "target");
            boolean a2 = MtbToolEditActivity.a(MtbToolEditActivity.this).a(viewHolder.getAdapterPosition(), target.getAdapterPosition());
            if (a2) {
                MtbToolEditActivity.b(MtbToolEditActivity.this).a(MtbToolEditActivity.a(MtbToolEditActivity.this).c());
                MtbToolEditActivity.b(MtbToolEditActivity.this).notifyDataSetChanged();
            }
            return a2;
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.f18359a.a((MtbToolEditActivity) null);
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, ev})).booleanValue();
        }
        q.c(ev, "ev");
        if (ev.getAction() == 1) {
            this.f18359a.g();
        }
        return super.dispatchTouchEvent(ev);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        View findViewById = findViewById(R.id.viewStubError);
        if (!(findViewById instanceof ViewStub)) {
            findViewById = null;
        }
        ViewStub viewStub = (ViewStub) findViewById;
        if (viewStub != null) {
            viewStub.inflate();
        }
        View findViewById2 = findViewById(R.id.llMtbError);
        if (findViewById2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        findViewById2.setVisibility(0);
        View findViewById3 = findViewById(R.id.basement_error_img);
        if (findViewById3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
        }
        com.taobao.phenix.intf.b.h().a("https://gw.alicdn.com/imgextra/i1/O1CN01hLnyGq1u2tFgVTqNH_!!6000000005980-2-tps-200-200.png").into((ImageView) findViewById3);
        View findViewById4 = findViewById(R.id.btn_basement_refresh);
        if (findViewById4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        findViewById4.setOnClickListener(new b(findViewById2));
    }

    public final void a(JSONArray listMyTool, JSONArray listMarket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0623eb8", new Object[]{this, listMyTool, listMarket});
            return;
        }
        q.c(listMyTool, "listMyTool");
        q.c(listMarket, "listMarket");
        c cVar = this.c;
        if (cVar == null) {
            q.b("myToolAdapter");
        }
        cVar.a(listMyTool);
        c cVar2 = this.c;
        if (cVar2 == null) {
            q.b("myToolAdapter");
        }
        cVar2.notifyDataSetChanged();
        c cVar3 = this.e;
        if (cVar3 == null) {
            q.b("marketAdapter");
        }
        cVar3.a(listMarket);
        c cVar4 = this.e;
        if (cVar4 == null) {
            q.b("marketAdapter");
        }
        cVar4.notifyDataSetChanged();
        View findViewById = findViewById(R.id.llMtbError);
        if (!(findViewById instanceof View)) {
            findViewById = null;
        }
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    private final void a(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            Object mo1572remove = this.f18359a.d().mo1572remove(i);
            c cVar = this.e;
            if (cVar == null) {
                q.b("marketAdapter");
            }
            cVar.a(this.f18359a.d());
            c cVar2 = this.e;
            if (cVar2 == null) {
                q.b("marketAdapter");
            }
            cVar2.notifyDataSetChanged();
            WrapContentRecyclerView wrapContentRecyclerView = this.d;
            if (wrapContentRecyclerView == null) {
                q.b("rvMarket");
            }
            wrapContentRecyclerView.refreshHeight(this.h);
            this.f18359a.c().add(mo1572remove);
            c cVar3 = this.c;
            if (cVar3 == null) {
                q.b("myToolAdapter");
            }
            cVar3.a(this.f18359a.c());
            c cVar4 = this.c;
            if (cVar4 == null) {
                q.b("myToolAdapter");
            }
            cVar4.notifyDataSetChanged();
            WrapContentRecyclerView wrapContentRecyclerView2 = this.b;
            if (wrapContentRecyclerView2 == null) {
                q.b("rvMyTool");
            }
            wrapContentRecyclerView2.refreshHeight(this.h);
            this.f18359a.a(true);
            this.f18359a.g();
            TextView textView = this.f;
            if (textView == null) {
                q.b("tvMarketTitle");
            }
            if (this.f18359a.d().isEmpty()) {
                i2 = 4;
            }
            textView.setVisibility(i2);
            com.taobao.mytaobao.biztool.a aVar = this.f18359a;
            if (mo1572remove == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            aVar.a((JSONObject) mo1572remove);
        } catch (Throwable unused) {
        }
    }

    private final void b(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (this.f18359a.c().size() <= 3) {
                Toast.makeText(this, "至少保留3个工具哦~", 0).show();
                return;
            }
            Object mo1572remove = this.f18359a.c().mo1572remove(i);
            c cVar = this.c;
            if (cVar == null) {
                q.b("myToolAdapter");
            }
            cVar.a(this.f18359a.c());
            c cVar2 = this.c;
            if (cVar2 == null) {
                q.b("myToolAdapter");
            }
            cVar2.notifyDataSetChanged();
            WrapContentRecyclerView wrapContentRecyclerView = this.b;
            if (wrapContentRecyclerView == null) {
                q.b("rvMyTool");
            }
            wrapContentRecyclerView.refreshHeight(this.h);
            this.f18359a.d().add(0, mo1572remove);
            c cVar3 = this.e;
            if (cVar3 == null) {
                q.b("marketAdapter");
            }
            cVar3.a(this.f18359a.d());
            c cVar4 = this.e;
            if (cVar4 == null) {
                q.b("marketAdapter");
            }
            cVar4.notifyDataSetChanged();
            WrapContentRecyclerView wrapContentRecyclerView2 = this.d;
            if (wrapContentRecyclerView2 == null) {
                q.b("rvMarket");
            }
            wrapContentRecyclerView2.refreshHeight(this.h);
            this.f18359a.a(true);
            this.f18359a.g();
            TextView textView = this.f;
            if (textView == null) {
                q.b("tvMarketTitle");
            }
            if (this.f18359a.d().isEmpty()) {
                i2 = 4;
            }
            textView.setVisibility(i2);
            com.taobao.mytaobao.biztool.a aVar = this.f18359a;
            if (mo1572remove == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            aVar.b((JSONObject) mo1572remove);
        } catch (Throwable unused) {
        }
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.mytaobao.ut.c.a(this, this.f18359a.a());
        com.taobao.mytaobao.ut.c.a(this, ai.b(kotlin.j.a("spm-cnt", "mytaobao.itool.0.0")));
    }
}
