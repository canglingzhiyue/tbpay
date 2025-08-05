package tb;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.login4android.api.Login;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.s;
import com.taobao.search.mmd.util.e;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HintGuideBean;
import com.taobao.taobao.R;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import tb.nqw;

/* loaded from: classes7.dex */
public final class nqg extends iut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PopupWindow f31651a;
    private TextView b;
    private final Handler c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private HintGuideBean h;
    private final Runnable i;
    private final View j;
    private final SearchDoorContext k;

    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            PopupWindow a2 = nqg.a(nqg.this);
            if (a2 == null) {
                return;
            }
            a2.dismiss();
        }
    }

    /* loaded from: classes7.dex */
    public static final class b extends i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.searchbaseframe.util.i
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            PopupWindow a2 = nqg.a(nqg.this);
            if (a2 != null) {
                Activity activity = nqg.this.getActivity();
                q.a((Object) activity, "activity");
                if (!activity.isFinishing()) {
                    a2.setWidth(-2);
                    a2.setHeight(-2);
                    a2.showAsDropDown(nqg.b(nqg.this), 0, -j.a(5.0f), 5);
                    nqg.c(nqg.this).postDelayed(nqg.d(nqg.this), 3000L);
                }
            }
            nqg.e(nqg.this);
        }
    }

    static {
        kge.a(1699637364);
    }

    public static /* synthetic */ Object ipc$super(nqg nqgVar, String str, Object... objArr) {
        if (str.hashCode() == 299066517) {
            super.onCtxPause();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "HintGuideWidget";
    }

    public static final /* synthetic */ PopupWindow a(nqg nqgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("4aeebae0", new Object[]{nqgVar}) : nqgVar.f31651a;
    }

    public static final /* synthetic */ View b(nqg nqgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("edbe68d7", new Object[]{nqgVar}) : nqgVar.j;
    }

    public static final /* synthetic */ Handler c(nqg nqgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("efbe30b0", new Object[]{nqgVar}) : nqgVar.c;
    }

    public static final /* synthetic */ Runnable d(nqg nqgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("5d7d675d", new Object[]{nqgVar}) : nqgVar.i;
    }

    public static final /* synthetic */ void e(nqg nqgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0be4f58", new Object[]{nqgVar});
        } else {
            nqgVar.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqg(Activity context, ium parent, View searchButton, SearchDoorContext searchDoorContext) {
        super(context, parent);
        q.c(context, "context");
        q.c(parent, "parent");
        q.c(searchButton, "searchButton");
        q.c(searchDoorContext, "searchDoorContext");
        this.j = searchButton;
        this.k = searchDoorContext;
        this.c = new Handler(Looper.getMainLooper());
        this.i = new a();
        subscribeEvent(this);
    }

    public final void onEventMainThread(nqw.d event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95b8fe1", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        this.h = event.f31672a.m;
        if (this.d && !this.e) {
            a(this.h);
        } else {
            this.f = true;
        }
    }

    public final void onEventMainThread(nrg event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2c4072", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        this.d = true;
        if (TextUtils.isEmpty(event.f31684a) && !event.b) {
            if (!this.f) {
                return;
            }
            a(this.h);
            return;
        }
        this.e = true;
    }

    private final void a(HintGuideBean hintGuideBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1bddc11", new Object[]{this, hintGuideBean});
        } else if (!c(hintGuideBean)) {
        } else {
            if (hintGuideBean == null) {
                q.a();
            }
            b(hintGuideBean);
        }
    }

    private final void b(HintGuideBean hintGuideBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e6be52", new Object[]{this, hintGuideBean});
            return;
        }
        a();
        TextView textView = this.b;
        if (textView == null) {
            q.b("guideTextView");
        }
        textView.setText(hintGuideBean.getShowText());
        this.c.post(new b());
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f31651a != null) {
        } else {
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_hint_guide_pop, new FrameLayout(getActivity()));
            View findViewById = inflate.findViewById(R.id.tv_show_text);
            q.a((Object) findViewById, "popView.findViewById(R.id.tv_show_text)");
            this.b = (TextView) findViewById;
            this.f31651a = new PopupWindow(inflate);
        }
    }

    @Override // tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        this.c.removeCallbacks(this.i);
        PopupWindow popupWindow = this.f31651a;
        if (popupWindow == null) {
            return;
        }
        popupWindow.dismiss();
    }

    private final boolean c(HintGuideBean hintGuideBean) {
        SharedPreferences a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b00fa097", new Object[]{this, hintGuideBean})).booleanValue();
        }
        if (this.g) {
            return false;
        }
        this.g = true;
        if (hintGuideBean == null || !hintGuideBean.isLegal() || (a2 = s.a()) == null || a2.getLong(k.IMAGE_SEARCH_NEW_USER_GUIDE_TIME, 0L) == 0) {
            return false;
        }
        if (a2.getBoolean(Login.getNick() + "_hintUsed", false)) {
            return false;
        }
        String str = Login.getNick() + "_" + hintGuideBean.getNameSpace() + "_";
        int i = a2.getInt(str + "totalCount", 0);
        if (i > hintGuideBean.getTotalCount()) {
            return false;
        }
        int i2 = a2.getInt(str + "intervalCount", -1);
        if (i2 >= hintGuideBean.getShowInterval() - 1 || i2 < 0) {
            a2.edit().putInt(str + "intervalCount", 0).putInt(str + "totalCount", i + 1).apply();
            return true;
        }
        a2.edit().putInt(str + "intervalCount", i2 + 1).apply();
        return false;
    }

    private final void b() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        SearchBarHintBean f = this.k.f("all");
        if (f == null || (str = f.searchText) == null) {
            str = "";
        }
        this.k.a(System.currentTimeMillis());
        Pair[] pairArr = new Pair[3];
        pairArr[0] = kotlin.j.a("hintq", str);
        pairArr[1] = kotlin.j.a(k.KEY_SUGGEST_RN, this.k.g("all"));
        String a2 = this.k.a("from");
        if (a2 == null) {
            a2 = "";
        }
        pairArr[2] = kotlin.j.a("from", a2);
        e.b(SearchDoorActivity.PAGE_NAME, "hintq_guide_exposure", ai.a(pairArr));
    }
}
