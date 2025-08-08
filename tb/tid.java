package tb;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.f;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b;

/* loaded from: classes8.dex */
public class tid extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TextView f34113a;
    private final TextView b;
    private final TextView c;
    private final a d;
    private final thv e;

    static {
        kge.a(-1121383473);
    }

    public static /* synthetic */ Object ipc$super(tid tidVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ a a(tid tidVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("19681ded", new Object[]{tidVar}) : tidVar.d;
    }

    public static /* synthetic */ thv b(tid tidVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (thv) ipChange.ipc$dispatch("4742449a", new Object[]{tidVar}) : tidVar.e;
    }

    public tid(View view, thv thvVar, a aVar) {
        super(view);
        this.d = aVar;
        this.e = thvVar;
        this.f34113a = (TextView) view.findViewWithTag(b.TITLE_MAIN_TAG);
        this.b = (TextView) view.findViewWithTag(b.TITLE_SUB_TAG);
        this.c = (TextView) view.findViewWithTag(b.DEFAULT_TITLE_TAG);
    }

    public void a(JSONObject jSONObject) {
        TextView textView;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        final boolean equals = StringUtils.equals(jSONObject.getString(b.MENU_CODE), b.MY_CHANNEL);
        if (!equals) {
            StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) this.itemView.getLayoutParams();
            layoutParams.topMargin = f.a(this.itemView.getContext(), 14.0f);
            layoutParams.bottomMargin = f.a(this.itemView.getContext(), 5.0f);
            this.itemView.setLayoutParams(layoutParams);
        }
        boolean c = this.d.c();
        TextView textView2 = this.f34113a;
        if (textView2 != null) {
            textView2.setText(jSONObject.getString(b.SECTION_NAME));
            this.f34113a.setTextSize(16.0f);
            this.f34113a.setTextColor(Color.parseColor("#333333"));
        }
        TextView textView3 = this.b;
        if (textView3 != null) {
            String str = b.EDIT_INTRODUCER_TEXT;
            textView3.setText(c ? jSONObject.getString(str) : jSONObject.getString(b.INTRODUCER_TEXT));
            this.b.setTextSize(12.0f);
            TextView textView4 = this.b;
            if (!c) {
                str = b.INTRODUCER_TEXT_COLOR;
            }
            textView4.setTextColor(a(jSONObject, str, "#999999"));
        }
        if (this.c != null) {
            int measuredWidth = (this.itemView.getMeasuredWidth() - this.c.getMeasuredWidth()) / 2;
            this.c.setPadding(measuredWidth, 0, measuredWidth, 0);
            this.c.setText(jSONObject.getString(b.ALL_ADDED_TEXT));
            this.c.setTextColor(jSONObject.getIntValue(b.ALL_ADDED_TEXT_COLOR));
            this.c.setTextSize(12.0f);
        }
        TextView textView5 = this.b;
        if (textView5 != null && (textView = this.c) != null) {
            if (textView.getVisibility() == 0) {
                i = 8;
            }
            textView5.setVisibility(i);
        }
        if (this.itemView == null) {
            return;
        }
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.tid.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                g.a("PanelTitleViewHolder", "title is myChannel:" + equals);
                if (equals && !tid.a(tid.this).c()) {
                    g.a("PanelTitleViewHolder", "title onEditingState:");
                    tid.a(tid.this).a();
                }
                return true;
            }
        });
        this.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: tb.tid.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                tid.b(tid.this).a(false);
                return false;
            }
        });
    }

    private int a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95510c8f", new Object[]{this, jSONObject, str, str2})).intValue();
        }
        String string = jSONObject.getString(str);
        if (string == null) {
            return Color.parseColor(str2);
        }
        try {
            return Color.parseColor(string);
        } catch (Exception unused) {
            return Color.parseColor(str2);
        }
    }
}
