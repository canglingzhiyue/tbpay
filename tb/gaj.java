package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView;
import com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout;
import com.taobao.android.dinamicx.widget.refresh.layout.constant.DXRefreshState;
import com.taobao.android.dinamicx.widget.scroller.a;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class gaj extends gai {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOADMORE_TITLE = "load_more_title";
    public DXAbsOnLoadMoreView e;
    private View f;
    private TextView g;
    private ProgressBar h;
    private final ViewGroup i;

    static {
        kge.a(-33760430);
    }

    public static /* synthetic */ Object ipc$super(gaj gajVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public gaj(Context context) {
        this(context, null);
    }

    public gaj(Context context, DXAbsOnLoadMoreView dXAbsOnLoadMoreView) {
        this.e = dXAbsOnLoadMoreView;
        if (dXAbsOnLoadMoreView == null) {
            this.f = a.a(context, R.layout.dx_scrollable_load_more_bottom);
            this.g = (TextView) this.f.findViewById(R.id.scrollable_loadmore_tv);
            this.h = (ProgressBar) this.f.findViewById(R.id.scrollable_loadmore_progressbar);
        }
        a("加载中");
        c("");
        b("太火爆啦，点我再尝试下吧");
        this.i = new RelativeLayout(context);
        if (dXAbsOnLoadMoreView != null) {
            this.i.addView(dXAbsOnLoadMoreView, new ViewGroup.LayoutParams(-1, -2));
            return;
        }
        View view = this.f;
        if (view == null) {
            return;
        }
        this.i.addView(view, new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // tb.gal
    public View f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8c57b8ef", new Object[]{this}) : this.i;
    }

    @Override // tb.gas
    public void a(DXRefreshLayout dXRefreshLayout, DXRefreshState dXRefreshState, DXRefreshState dXRefreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d917981", new Object[]{this, dXRefreshLayout, dXRefreshState, dXRefreshState2});
        } else if (dXRefreshState == dXRefreshState2) {
        } else {
            a(dXRefreshLayout, a(dXRefreshState2));
            if (this.f28250a == null) {
                return;
            }
            this.f28250a.a(dXRefreshLayout, dXRefreshState, dXRefreshState2);
        }
    }

    public void a(DXRefreshLayout dXRefreshLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5129c2", new Object[]{this, dXRefreshLayout, new Integer(i)});
            return;
        }
        if (this.g != null) {
            if (this.c != 0) {
                this.g.setTextColor(this.c);
            }
            if (this.d != 0) {
                this.g.setTextSize(0, this.d);
            }
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i == 6) {
                            if (this.e != null) {
                                this.e.onLoadMoreStatusUpdate(i, new JSONObject());
                            } else {
                                this.h.setVisibility(8);
                                this.g.setText("");
                            }
                        }
                    } else if (this.e != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("load_more_title", (Object) e());
                        this.e.onLoadMoreStatusUpdate(i, jSONObject);
                    } else {
                        this.h.setVisibility(8);
                        this.g.setVisibility(0);
                        this.g.setText(e());
                    }
                } else if (this.e != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("load_more_title", (Object) "");
                    this.e.onLoadMoreStatusUpdate(i, jSONObject2);
                } else {
                    this.h.setVisibility(8);
                    this.g.setVisibility(0);
                    this.g.setText("");
                }
            } else if (this.e != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("load_more_title", (Object) d());
                this.e.onLoadMoreStatusUpdate(i, jSONObject3);
            } else {
                this.h.setVisibility(8);
                this.g.setVisibility(0);
                this.g.setText(d());
            }
        } else if (this.e != null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("load_more_title", (Object) c());
            this.e.onLoadMoreStatusUpdate(i, jSONObject4);
        } else {
            this.h.setVisibility(0);
            this.g.setVisibility(0);
            this.g.setText(c());
        }
        if (this.i == null) {
            return;
        }
        if (i == 6 || i == 4 || (i == 5 && TextUtils.isEmpty(e()))) {
            this.i.setVisibility(8);
            dXRefreshLayout.closeHeaderOrFooter();
            return;
        }
        this.i.setVisibility(0);
    }

    private int a(DXRefreshState dXRefreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("668cc390", new Object[]{this, dXRefreshState})).intValue();
        }
        if (dXRefreshState == DXRefreshState.None) {
            return 4;
        }
        if (dXRefreshState == DXRefreshState.PullDownLoading) {
            return 2;
        }
        if (dXRefreshState == DXRefreshState.PullDownLoadFail) {
            return 3;
        }
        return dXRefreshState == DXRefreshState.PullDownLoadNoData ? 5 : 4;
    }
}
