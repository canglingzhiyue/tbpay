package tb;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.model.viewmodel.main.j;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.detail.datasdk.event.params.SkuBottomBarStyleDTO;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.taobao.R;
import org.ifaa.android.manager.face.IFAAFaceManager;

/* loaded from: classes4.dex */
public class eao extends c<j> implements com.taobao.android.trade.event.j<eog> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout g;
    private TextView h;
    private TextView i;

    static {
        kge.a(-78426271);
        kge.a(-1453870097);
    }

    public static /* synthetic */ Object ipc$super(eao eaoVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.main.XSkuViewHolder";
    }

    public static /* synthetic */ b a(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f0bfab39", new Object[]{eaoVar}) : eaoVar.c;
    }

    public static /* synthetic */ b b(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("29a00bd8", new Object[]{eaoVar}) : eaoVar.c;
    }

    public static /* synthetic */ b c(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("62806c77", new Object[]{eaoVar}) : eaoVar.c;
    }

    public static /* synthetic */ b d(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9b60cd16", new Object[]{eaoVar}) : eaoVar.c;
    }

    public static /* synthetic */ b e(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d4412db5", new Object[]{eaoVar}) : eaoVar.c;
    }

    public static /* synthetic */ b f(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d218e54", new Object[]{eaoVar}) : eaoVar.c;
    }

    public static /* synthetic */ b g(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4601eef3", new Object[]{eaoVar}) : eaoVar.c;
    }

    public static /* synthetic */ b h(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7ee24f92", new Object[]{eaoVar}) : eaoVar.c;
    }

    public static /* synthetic */ Context i(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("493f5ea5", new Object[]{eaoVar}) : eaoVar.f9568a;
    }

    public static /* synthetic */ Context j(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("5ce73226", new Object[]{eaoVar}) : eaoVar.f9568a;
    }

    public static /* synthetic */ Context k(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("708f05a7", new Object[]{eaoVar}) : eaoVar.f9568a;
    }

    public static /* synthetic */ b l(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("6263d20e", new Object[]{eaoVar}) : eaoVar.c;
    }

    public static /* synthetic */ b m(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9b4432ad", new Object[]{eaoVar}) : eaoVar.c;
    }

    public static /* synthetic */ b n(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d424934c", new Object[]{eaoVar}) : eaoVar.c;
    }

    public static /* synthetic */ Context o(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("bf2e53ab", new Object[]{eaoVar}) : eaoVar.f9568a;
    }

    public static /* synthetic */ Context p(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d2d6272c", new Object[]{eaoVar}) : eaoVar.f9568a;
    }

    public static /* synthetic */ Context q(eao eaoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e67dfaad", new Object[]{eaoVar}) : eaoVar.f9568a;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(eog eogVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eogVar}) : a(eogVar);
    }

    public eao(Context context) {
        super(context);
        f.a(context).a(eno.a(eog.class), this);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.g = (RelativeLayout) View.inflate(context, R.layout.x_detail_main_xskuview, null);
        this.h = (TextView) this.g.findViewById(R.id.tv_chose_sku);
        this.i = (TextView) this.g.findViewById(R.id.tv_recommend_tip);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: tb.eao.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                StateListDrawable stateListDrawable;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (TStudioHelper.a().a(null, view, eao.a(eao.this) != null ? ((j) eao.b(eao.this)).dmComponent : null, false)) {
                    return;
                }
                SkuBottomBarStyleDTO skuBottomBarStyleDTO = SkuBottomBarStyleDTO.ADD_CART_AND_BUY;
                if (eao.c(eao.this) != null && ((j) eao.d(eao.this)).d) {
                    skuBottomBarStyleDTO = SkuBottomBarStyleDTO.ADD_CART_ONLY;
                }
                if (eao.e(eao.this) != null && ((j) eao.f(eao.this)).e) {
                    skuBottomBarStyleDTO = SkuBottomBarStyleDTO.CONFIRM;
                }
                OpenSkuEvent openSkuEvent = new OpenSkuEvent(skuBottomBarStyleDTO);
                if (eao.g(eao.this) != null && ((j) eao.h(eao.this)).needOpenGradient) {
                    openSkuEvent.b = ContextCompat.getDrawable(eao.i(eao.this), R.drawable.detail_gradient_color_orange);
                    openSkuEvent.d = ContextCompat.getDrawable(eao.j(eao.this), R.drawable.detail_gradient_color_orange);
                    openSkuEvent.c = ContextCompat.getDrawable(eao.k(eao.this), R.drawable.detail_gradient_color_yellow);
                }
                if (eao.l(eao.this) != null && ((j) eao.m(eao.this)).g) {
                    if (((j) eao.n(eao.this)).needOpenGradient) {
                        stateListDrawable = ContextCompat.getDrawable(eao.o(eao.this), R.drawable.detail_bottombar_presale_buy_bg);
                    } else {
                        StateListDrawable stateListDrawable2 = new StateListDrawable();
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                        int a2 = com.taobao.android.detail.core.utils.c.a("#7555f4");
                        shapeDrawable.getPaint().setColor(a2);
                        stateListDrawable2.addState(new int[0], shapeDrawable);
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
                        shapeDrawable2.getPaint().setColor(a2);
                        stateListDrawable2.addState(new int[]{16842919, 16842910}, shapeDrawable2);
                        stateListDrawable = stateListDrawable2;
                    }
                    openSkuEvent.b = stateListDrawable;
                }
                f.a(eao.p(eao.this), openSkuEvent);
                dzh.f(eao.q(eao.this));
            }
        });
        f.a(context).a(new eof());
        return this.g;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TextView textView = (TextView) this.g.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) this.g.findViewById(R.id.tv_icon);
        int a2 = fpr.a(this.f9568a, "9ap", 18);
        int a3 = fpr.a(this.f9568a, "12ap", 24);
        int a4 = fpr.a(this.f9568a, "13ap", 24);
        int a5 = fpr.a(this.f9568a, "14ap", 28);
        int a6 = fpr.a(this.f9568a, "40ap", 80);
        int a7 = fpr.a(this.f9568a, "42ap", 84);
        int a8 = fpr.a(this.f9568a, "25ap", 50);
        int a9 = fpr.a(this.f9568a, "205ap", IFAAFaceManager.STATUS_FACE_OFFSET_LEFT);
        float f = a4;
        textView.setTextSize(0, f);
        this.h.setTextSize(0, f);
        this.h.setMaxWidth(a9);
        this.i.setTextSize(0, f);
        textView2.setTextSize(0, a5);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = a6;
        layoutParams.width = a7;
        layoutParams.setMargins(a3, 0, 0, 0);
        textView.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
        if (TextUtils.isEmpty(((j) this.c).h)) {
            a3 = a6;
        }
        layoutParams2.setMargins(a3, 0, a8, 0);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) textView2.getLayoutParams();
        layoutParams3.setMargins(0, 0, a2, 0);
        textView2.setLayoutParams(layoutParams3);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270e470f", new Object[]{this, jVar});
            return;
        }
        if (TextUtils.isEmpty(this.h.getText())) {
            this.h.setText(((j) this.c).f9773a);
        }
        if (!TextUtils.isEmpty(((j) this.c).h)) {
            this.i.setText(((j) this.c).h);
        }
        c();
    }

    public i a(eog eogVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("7eef97d4", new Object[]{this, eogVar});
        }
        if (eogVar != null && !TextUtils.isEmpty(eogVar.b) && eogVar.b.startsWith("%new_sku%")) {
            this.h.setText(eogVar.b.replace("%new_sku%", ""));
            return a.SUCCESS;
        }
        return b(eogVar);
    }

    private i b(eog eogVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("38672573", new Object[]{this, eogVar});
        }
        if (eogVar == null || eogVar.f27498a == null) {
            return a.FAILURE;
        }
        String str = eogVar.b;
        SkuPageModel.SkuChoiceVO skuChoiceVO = eogVar.f27498a;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(com.alibaba.ability.localization.b.a(R.string.x_detail_app_sku_selected));
            sb.append(str);
        } else {
            sb.append(skuChoiceVO.getSkuInfoDesc());
        }
        if (TextUtils.isEmpty(sb.toString()) && this.c != 0) {
            sb = new StringBuilder(((j) this.c).f9773a);
        }
        this.h.setText(sb);
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        RelativeLayout relativeLayout = this.g;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        f.a(this.f9568a).b(eno.a(eog.class), this);
    }
}
