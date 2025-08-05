package com.taobao.android.editionswitcher.boarding;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.boarding.LocaleModel;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private PopupWindow f12279a;
    private f b;
    private TextView c;
    private TextView d;

    /* loaded from: classes5.dex */
    public interface a {
        void a(LocaleModel.LocaleData localeData);
    }

    static {
        kge.a(-1463888842);
    }

    public static /* synthetic */ void a(Window window, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d8fb21", new Object[]{window, new Float(f)});
        } else {
            b(window, f);
        }
    }

    public static g a(Activity activity, List<LocaleModel.LocaleData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b32b0b25", new Object[]{activity, list});
        }
        g gVar = new g();
        gVar.b = new f(list);
        gVar.b(activity);
        return gVar;
    }

    public g a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("c4c2c46c", new Object[]{this, str});
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(str);
        }
        return this;
    }

    public g b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b61453ed", new Object[]{this, str});
        }
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(str);
        }
        return this;
    }

    public g a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b5f7acff", new Object[]{this, aVar});
        }
        this.b.a(new a() { // from class: com.taobao.android.editionswitcher.boarding.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                g.this = this;
            }

            @Override // com.taobao.android.editionswitcher.boarding.g.a
            public void a(LocaleModel.LocaleData localeData) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1151f12e", new Object[]{this, localeData});
                    return;
                }
                g.this.a();
                aVar.a(localeData);
            }
        });
        return this;
    }

    private void b(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.ovs_layout_locale_popwindow, (ViewGroup) null, false);
        this.f12279a = new PopupWindow(inflate, -1, -2);
        this.f12279a.setOutsideTouchable(true);
        this.f12279a.setTouchable(true);
        this.f12279a.setFocusable(true);
        this.f12279a.setAnimationStyle(R.style.OvsPopupAnimation);
        this.f12279a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.android.editionswitcher.boarding.PopWindowView$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                } else {
                    g.a(activity.getWindow(), 1.0f);
                }
            }
        });
        this.c = (TextView) inflate.findViewById(R.id.title_tx);
        this.d = (TextView) inflate.findViewById(R.id.chosen_tx);
        inflate.findViewById(R.id.close_btn).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.editionswitcher.boarding.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                g.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    g.this.a();
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list);
        recyclerView.setAdapter(this.b);
        int i = activity.getResources().getDisplayMetrics().heightPixels;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (this.b.getItemCount() > 7) {
            layoutParams.height = (int) (i * 0.75f);
        } else {
            layoutParams.height = (int) (i * 0.17f);
        }
        recyclerView.setLayoutParams(layoutParams);
    }

    private static void b(Window window, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2a0be2", new Object[]{window, new Float(f)});
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = f;
        window.setAttributes(attributes);
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        PopupWindow popupWindow = this.f12279a;
        if (popupWindow == null) {
            return;
        }
        popupWindow.showAtLocation(activity.getWindow().getDecorView(), 80, 0, 0);
        b(activity.getWindow(), 0.6f);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = this.f12279a;
        if (popupWindow == null) {
            return;
        }
        popupWindow.dismiss();
    }
}
