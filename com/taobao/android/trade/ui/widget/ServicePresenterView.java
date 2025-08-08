package com.taobao.android.trade.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.jkp;
import tb.kge;

/* loaded from: classes6.dex */
public class ServicePresenterView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b serviceViewHelper;
    private List<a> services;
    private EllipsizedView servicesContaienr;
    private TextSizeUnit textSizeUnit;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public enum TextSizeUnit {
        sp(2),
        dip(1);
        
        public int unit;

        TextSizeUnit(int i) {
            this.unit = i;
        }

        public static TextSizeUnit toEnum(int i) {
            return i == 0 ? sp : dip;
        }
    }

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f15645a;
        public String b;
        public String c;

        static {
            kge.a(1735425633);
        }
    }

    static {
        kge.a(1554109990);
    }

    public ServicePresenterView(Context context) {
        this(context, null);
    }

    public ServicePresenterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ServicePresenterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.textSizeUnit = TextSizeUnit.sp;
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cba817", new Object[]{this, attributeSet});
        } else if (isInEditMode()) {
        } else {
            if (attributeSet != null) {
                TypedArray typedArray = null;
                try {
                    typedArray = getContext().obtainStyledAttributes(attributeSet, R.styleable.TradeServicePresenter);
                    this.textSizeUnit = TextSizeUnit.toEnum(typedArray.getInt(R.styleable.TradeServicePresenter_trade_text_size_unit, 0));
                } finally {
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                }
            }
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            this.servicesContaienr = new EllipsizedView(getContext());
            addView(this.servicesContaienr);
            this.serviceViewHelper = new b(getContext());
            this.serviceViewHelper.a(this.textSizeUnit);
        }
    }

    public void setServices(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0ba258", new Object[]{this, list});
            return;
        }
        List<a> list2 = this.services;
        if (list2 != null) {
            list2.clear();
        }
        this.services = list;
        this.serviceViewHelper.a(this.services, this.servicesContaienr);
    }

    public void addServices(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f029a17", new Object[]{this, list});
            return;
        }
        if (this.services == null) {
            this.services = new ArrayList();
        }
        this.services.addAll(list);
        this.serviceViewHelper.a(this.services, this.servicesContaienr);
    }

    public void clearServices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba6834d2", new Object[]{this});
            return;
        }
        List<a> list = this.services;
        if (list != null && list.size() > 0) {
            this.services.clear();
            this.services = null;
        }
        this.serviceViewHelper.a(this.services, this.servicesContaienr);
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f15646a;
        private TextSizeUnit c = TextSizeUnit.sp;
        private List<TextView> b = new ArrayList();

        static {
            kge.a(895111210);
        }

        public b(Context context) {
            this.f15646a = context;
        }

        public void a(List<a> list, EllipsizedView ellipsizedView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1636169e", new Object[]{this, list, ellipsizedView});
                return;
            }
            if (ellipsizedView != null) {
                ellipsizedView.reset();
            }
            if (list == null || list.size() <= 0 || ellipsizedView == null) {
                if (ellipsizedView == null) {
                    return;
                }
                ellipsizedView.setVisibility(8);
                return;
            }
            a(list.size());
            ellipsizedView.setVisibility(0);
            for (int i = 0; i < list.size(); i++) {
                a aVar = list.get(i);
                if (aVar != null && !StringUtils.isEmpty(aVar.f15645a)) {
                    TextView textView = this.b.get(i);
                    textView.setText(aVar.f15645a);
                    a(textView, aVar);
                    ellipsizedView.addItemView(textView);
                }
            }
        }

        private void a(TextView textView, a aVar) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d619c1e2", new Object[]{this, textView, aVar});
                return;
            }
            int color = this.f15646a.getResources().getColor(R.color.TC_D_D);
            try {
                if (!StringUtils.isEmpty(aVar.c)) {
                    i = jkp.a(aVar.c, color);
                    a(textView, i);
                } else if (!StringUtils.isEmpty(aVar.b)) {
                    textView.setBackgroundResource(R.drawable.trade_service_bg);
                    GradientDrawable gradientDrawable = (GradientDrawable) textView.getBackground();
                    if (gradientDrawable != null) {
                        gradientDrawable.setColor(jkp.a(aVar.b, color));
                    }
                    i = -1;
                } else {
                    a(textView, color);
                    i = color;
                }
                textView.setTextColor(i);
            } catch (Exception unused) {
                textView.setTextColor(color);
                a(textView, color);
            }
        }

        private void a(TextView textView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c7b0fa7", new Object[]{this, textView, new Integer(i)});
            } else if (textView == null) {
            } else {
                textView.setBackgroundResource(R.drawable.trade_service_border_bg);
                GradientDrawable gradientDrawable = (GradientDrawable) textView.getBackground();
                if (gradientDrawable == null) {
                    return;
                }
                gradientDrawable.setCornerRadius(jkp.a(this.f15646a, 2.0f));
                gradientDrawable.setStroke(jkp.a(this.f15646a, 1.0f), i);
                gradientDrawable.setColor(0);
            }
        }

        private void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            int size = this.b.size();
            if (i <= size) {
                return;
            }
            for (int i2 = 0; i2 < i - size; i2++) {
                this.b.add(a());
            }
        }

        private TextView a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("ce905cdc", new Object[]{this});
            }
            int a2 = jkp.a(this.f15646a, 2.0f);
            int a3 = jkp.a(this.f15646a, 1.0f);
            TextView textView = new TextView(this.f15646a);
            textView.setTextSize(this.c.unit, 10.0f);
            textView.setTextColor(-1);
            textView.setBackgroundResource(R.drawable.trade_service_bg);
            textView.setEllipsize(StringUtils.TruncateAt.END);
            textView.setSingleLine();
            textView.setPadding(a2, a3, a2, a3);
            return textView;
        }

        public void a(TextSizeUnit textSizeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a8b1a87", new Object[]{this, textSizeUnit});
            } else {
                this.c = textSizeUnit;
            }
        }
    }
}
