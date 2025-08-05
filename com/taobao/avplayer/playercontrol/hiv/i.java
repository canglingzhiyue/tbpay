package com.taobao.avplayer.playercontrol.hiv;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.interactivelifecycle.hiv.request.ContentDetailData;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.util.ArrayList;
import tb.kcl;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CHILD_TYPE_ALARM = 1002;
    public static final int CHILD_TYPE_SHARE = 1001;

    /* renamed from: a  reason: collision with root package name */
    private Context f16595a;
    private ContentDetailData b;
    private LinearLayout c;
    private int d;
    private int e = 0;
    private DWContext f;
    private a g;
    private View h;

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(1370073570);
    }

    public static /* synthetic */ void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d84c3023", new Object[]{iVar});
        } else {
            iVar.e();
        }
    }

    public static /* synthetic */ a b(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("88e03a0", new Object[]{iVar}) : iVar.g;
    }

    public i(Context context, DWContext dWContext) {
        this.f16595a = context;
        this.f = dWContext;
        this.d = kcl.a(this.f16595a, 187.0f);
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_MenuWindow);
    }

    public void a(ArrayList<Integer> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
        } else if (arrayList != null && !arrayList.isEmpty()) {
            this.c = new LinearLayout(this.f16595a);
            this.c.setBackgroundResource(R.drawable.hiv_menu_window_bg);
            this.c.setOrientation(1);
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, kcl.a(this.f16595a, 48.0f));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(kcl.a(this.f16595a, 125.0f), 1);
            layoutParams2.setMargins(kcl.a(this.f16595a, 36.0f), 0, 0, 0);
            for (int i = 0; i < arrayList.size(); i++) {
                this.e += kcl.a(this.f16595a, 48.0f);
                LinearLayout linearLayout = new LinearLayout(this.f16595a);
                linearLayout.setOrientation(0);
                ImageView imageView = new ImageView(this.f16595a);
                TextView textView = new TextView(this.f16595a);
                int intValue = arrayList.get(i).intValue();
                if (intValue == 1001) {
                    imageView.setImageDrawable(ContextCompat.getDrawable(this.f16595a, R.drawable.hiv_share_icon));
                    textView.setText("分享");
                    linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.hiv.i.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            i.this.d();
                            i.a(i.this);
                        }
                    });
                } else if (intValue == 1002) {
                    imageView.setImageDrawable(ContextCompat.getDrawable(this.f16595a, R.drawable.hiv_alarm_icon));
                    textView.setText("我要举报");
                    linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.hiv.i.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            i.this.d();
                            if (i.b(i.this) == null) {
                                return;
                            }
                            i.b(i.this).a();
                        }
                    });
                    this.h = linearLayout;
                }
                int a2 = kcl.a(this.f16595a, 40.0f);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(a2, a2);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(kcl.a(this.f16595a, 126.0f), -2);
                layoutParams3.gravity = 17;
                layoutParams4.gravity = 17;
                imageView.setLayoutParams(layoutParams3);
                textView.setLayoutParams(layoutParams4);
                textView.setTextSize(16.0f);
                textView.setGravity(19);
                linearLayout.addView(imageView, layoutParams3);
                linearLayout.addView(textView, layoutParams4);
                if (i > 0) {
                    View view = new View(this.f16595a);
                    view.setBackgroundResource(R.color.detail_action_bar_divider_bg);
                    this.c.addView(view, layoutParams2);
                }
                this.c.addView(linearLayout, layoutParams);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        View view = this.h;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View view = this.h;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.c;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.c;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(4);
    }

    public void a(ContentDetailData contentDetailData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19dc05de", new Object[]{this, contentDetailData});
        } else {
            this.b = contentDetailData;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d5ab86", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f.mSharedapter == null || this.b == null) {
        } else {
            if (this.f.screenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
                this.f.handleKeyBack();
            }
            this.f.getVideo().k();
            this.f.mSharedapter.a(this.f.getActivity(), this.b.videoTitle, "", this.b.videoCoverImgUrl, this.b.shareUrl, "2017zaowu-live");
            j.a(this.f, "fullInteractShare", j.b(this.f, this.b));
        }
    }
}
