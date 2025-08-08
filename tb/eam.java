package tb;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import mtopsdk.common.util.StringUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.o;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TIconFontTextView;
import com.taobao.android.detail.datasdk.model.datamodel.node.Props2Node;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.trade.event.f;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class eam extends c<TitleViewModel> implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView g;
    public TextView h;
    public TextView i;
    public DetailImageView j;
    public DetailImageView k;
    public LinearLayout l;
    public TextView m;
    public TIconFontTextView n;
    private TitleViewModel o;
    private Handler p;
    private long q;
    private View.OnLongClickListener r;

    static {
        kge.a(-1658183874);
        kge.a(-1043440182);
    }

    public static /* synthetic */ Object ipc$super(eam eamVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.main.TitleViewHolder";
    }

    public static /* synthetic */ long a(eam eamVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e883d9b1", new Object[]{eamVar, new Long(j)})).longValue();
        }
        eamVar.q = j;
        return j;
    }

    public static /* synthetic */ TitleViewModel a(eam eamVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TitleViewModel) ipChange.ipc$dispatch("727dec31", new Object[]{eamVar}) : eamVar.o;
    }

    public static /* synthetic */ Context b(eam eamVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("de068760", new Object[]{eamVar}) : eamVar.f9568a;
    }

    public static /* synthetic */ long c(eam eamVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c37de6dd", new Object[]{eamVar})).longValue() : eamVar.q;
    }

    public static /* synthetic */ Context d(eam eamVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("5562e62", new Object[]{eamVar}) : eamVar.f9568a;
    }

    public static /* synthetic */ Context e(eam eamVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("18fe01e3", new Object[]{eamVar}) : eamVar.f9568a;
    }

    public static /* synthetic */ Context f(eam eamVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("2ca5d564", new Object[]{eamVar}) : eamVar.f9568a;
    }

    public eam(Context context) {
        super(context);
        this.q = 0L;
        this.r = new View.OnLongClickListener() { // from class: tb.eam.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                if (eam.a(eam.this) == null) {
                    return true;
                }
                efq efqVar = new efq();
                efqVar.f27283a = eam.this.g;
                efqVar.b = eam.a(eam.this).g;
                efqVar.c = eam.a(eam.this).b;
                f.a(eam.b(eam.this), efqVar);
                return true;
            }
        };
        this.p = new Handler(this);
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (StringUtils.isEmpty(str)) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
            if (StringUtils.isEmpty(str2)) {
                this.j.setVisibility(8);
            } else {
                com.taobao.android.detail.core.detail.kit.utils.f.a(this.f9568a).a(this.j, str2);
                str = "      " + str;
                this.j.setVisibility(0);
            }
            b(str, str3);
            Handler handler = this.p;
            if (handler == null) {
                return;
            }
            handler.removeMessages(201);
            this.p.sendEmptyMessage(201);
        }
    }

    private SpannableStringBuilder a(ArrayList<Props2Node.a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("e9614f65", new Object[]{this, arrayList});
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            Props2Node.a aVar = arrayList.get(i);
            if (!StringUtils.isEmpty(aVar.f9988a) && !StringUtils.isEmpty(aVar.b)) {
                if (i != 0) {
                    spannableStringBuilder.append((CharSequence) " | ");
                }
                spannableStringBuilder.append((CharSequence) aVar.f9988a).append((CharSequence) aVar.b);
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Props2Node.a aVar2 = arrayList.get(i3);
            if (!StringUtils.isEmpty(aVar2.f9988a) && !StringUtils.isEmpty(aVar2.b)) {
                if (i3 != 0) {
                    int i4 = i2 + 3;
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#D5D5D5")), i2, i4, 33);
                    i2 = i4;
                }
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#999999")), i2, aVar2.f9988a.length() + i2, 33);
                int length = i2 + aVar2.f9988a.length();
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#333333")), length, aVar2.b.length() + length, 33);
                i2 = length + aVar2.b.length();
            }
        }
        return spannableStringBuilder;
    }

    private void b(String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (this.g != null) {
            if (!StringUtils.isEmpty(str2)) {
                try {
                    SpannableString spannableString = new SpannableString(str);
                    for (String str3 : str2.split(",")) {
                        if (!StringUtils.isEmpty(str3)) {
                            Matcher matcher = Pattern.compile(str3).matcher(spannableString);
                            while (matcher.find()) {
                                spannableString.setSpan(new ForegroundColorSpan(this.f9568a.getResources().getColor(R.color.detail_theme_color)), matcher.start(), matcher.end(), 33);
                            }
                        }
                    }
                    this.g.setText(spannableString);
                    return;
                } catch (Throwable unused) {
                    this.g.setText(str);
                    return;
                }
            }
            this.g.setText(str);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a(14, 14);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        LinearLayout linearLayout = (LinearLayout) View.inflate(this.f9568a, R.layout.x_detail_main_title, null);
        linearLayout.setTag(this);
        this.g = (TextView) linearLayout.findViewById(R.id.detail_main_title_text);
        this.i = (TextView) linearLayout.findViewById(R.id.detail_main_properties);
        this.h = (TextView) linearLayout.findViewById(R.id.detail_main_subtitle_text);
        this.j = (DetailImageView) linearLayout.findViewById(R.id.detail_main_title_logo);
        this.j.setTag(R.id.detail_main_title_logo, this.g);
        this.g.setOnLongClickListener(this.r);
        this.l = (LinearLayout) linearLayout.findViewById(R.id.detail_main_title_share);
        this.n = (TIconFontTextView) linearLayout.findViewById(R.id.detail_main_title_share_icon);
        this.k = (DetailImageView) linearLayout.findViewById(R.id.detail_main_show_gift);
        this.m = (TextView) linearLayout.findViewById(R.id.detail_main_title_share_text);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: tb.eam.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context e;
                eoi eoiVar;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - eam.c(eam.this) < 500) {
                    eam.a(eam.this, currentTimeMillis);
                    return;
                }
                eam.a(eam.this, currentTimeMillis);
                if (eam.a(eam.this) != null) {
                    e = eam.d(eam.this);
                    eoiVar = new eoi(eam.a(eam.this).l);
                } else {
                    e = eam.e(eam.this);
                    eoiVar = new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT);
                }
                f.a(e, eoiVar);
                dzh.g(eam.f(eam.this));
            }
        });
        if (com.taobao.android.detail.core.detail.kit.utils.c.b()) {
            View findViewById = linearLayout.findViewById(R.id.detail_main_title_divider);
            findViewById.setVisibility(0);
            findViewById.setBackgroundColor(-1);
        }
        return linearLayout;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        this.g.setVisibility(0);
        if (StringUtils.isEmpty(str2)) {
            this.j.setVisibility(8);
        } else {
            com.taobao.android.detail.core.detail.kit.utils.f.a(this.f9568a).a(this.j, str2);
            str = "      " + str;
            this.j.setVisibility(0);
        }
        this.g.setMaxLines(1);
        this.g.setText(str);
        Handler handler = this.p;
        if (handler == null) {
            return;
        }
        handler.removeMessages(202);
        this.p.sendEmptyMessage(202);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(TitleViewModel titleViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2469c532", new Object[]{this, titleViewModel});
            return;
        }
        c();
        this.o = titleViewModel;
        if (ecu.b && !StringUtils.isEmpty(this.o.m) && this.o.n != null && this.o.n.size() != 0) {
            a(this.o.m, this.o.e);
            this.i.setVisibility(0);
            this.i.setText(a(this.o.n));
        } else {
            a(this.o.b, this.o.e, TitleViewModel.f10064a);
            if (titleViewModel.d && !StringUtils.isEmpty(titleViewModel.c)) {
                this.h.setVisibility(0);
                this.h.setText(titleViewModel.c);
            } else {
                this.h.setVisibility(8);
            }
        }
        if (!StringUtils.isEmpty(titleViewModel.k)) {
            this.m.setVisibility(8);
            this.n.setVisibility(8);
            this.k.setVisibility(0);
            com.taobao.android.detail.core.detail.kit.utils.f.a(this.f9568a).a(this.k, titleViewModel.k);
            return;
        }
        this.k.setVisibility(8);
        this.m.setVisibility(0);
        this.n.setVisibility(0);
        if (StringUtils.isEmpty(titleViewModel.j)) {
            return;
        }
        this.m.setText(titleViewModel.j);
        if (titleViewModel.l == TitleViewModel.ShareType.SHARE_TYPE_DEFAULT) {
            this.n.setText(this.f9568a.getString(R.string.taodetail_iconfont_share));
            this.n.setTextColor(this.f9568a.getResources().getColor(R.color.detail_title_share));
        } else if (titleViewModel.l == TitleViewModel.ShareType.SHARE_TYPE_PRESENT) {
            this.n.setText(this.f9568a.getString(R.string.taodetail_iconfont_share_gift));
            this.n.setTextColor(this.f9568a.getResources().getColor(R.color.detail_orange));
        } else if (titleViewModel.l == TitleViewModel.ShareType.SHARE_TYPE_GIFT) {
            this.n.setText(this.f9568a.getString(R.string.taodetail_iconfont_share_present));
            this.n.setTextColor(this.f9568a.getResources().getColor(R.color.detail_orange));
            this.m.setTextColor(this.f9568a.getResources().getColor(R.color.detail_orange));
        } else if (titleViewModel.l == TitleViewModel.ShareType.SHARE_TYPE_AWARD) {
            this.n.setText(this.f9568a.getString(R.string.taodetail_iconfont_share_money_bag_fill));
            this.n.setTextColor(this.f9568a.getResources().getColor(R.color.detail_light_orange));
        }
        this.l.setContentDescription(titleViewModel.j);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 201) {
            if (!o.a(this.g)) {
                a(12, 14);
            }
            return true;
        }
        if (i == 202 && !o.a(this.i)) {
            a(10);
        }
        return false;
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.g.setTextSize(1, i);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = epo.b(i2);
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.i.setTextSize(1, i);
        }
    }
}
