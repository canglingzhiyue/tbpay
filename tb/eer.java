package tb;

import android.app.Application;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.event.basic.q;
import com.taobao.android.detail.core.utils.f;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class eer implements Handler.Callback, j<q> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27245a;
    private Application b;
    private Handler c = new Handler(this);

    static {
        kge.a(286781678);
        kge.a(-1453870097);
        kge.a(-1043440182);
    }

    public static /* synthetic */ Application a(eer eerVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("a7414f95", new Object[]{eerVar}) : eerVar.b;
    }

    public static /* synthetic */ void a(eer eerVar, String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573c5105", new Object[]{eerVar, str, bitmapDrawable});
        } else {
            eerVar.c(str, bitmapDrawable);
        }
    }

    public static /* synthetic */ void b(eer eerVar, String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e483806", new Object[]{eerVar, str, bitmapDrawable});
        } else {
            eerVar.b(str, bitmapDrawable);
        }
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, qVar}) : a(qVar);
    }

    public eer(DetailCoreActivity detailCoreActivity) {
        this.f27245a = detailCoreActivity;
        this.b = this.f27245a.getApplication();
        emu.a("com.taobao.android.detail.core.event.subscriber.basic.SaveBigImageSubscriber");
    }

    public i a(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("1be5692e", new Object[]{this, qVar});
        }
        ImageView imageView = qVar.f9713a;
        if (imageView.getTag() instanceof String) {
            a((String) imageView.getTag(), (BitmapDrawable) imageView.getDrawable());
        }
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private void a(String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1cd0a7", new Object[]{this, str, bitmapDrawable});
            return;
        }
        Dialog dialog = new Dialog(this.f27245a, R.style.Theme_TBDialog);
        LinearLayout linearLayout = new LinearLayout(this.f27245a);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setBackgroundColor(-1);
        linearLayout.setOrientation(1);
        linearLayout.addView(a(str, bitmapDrawable, dialog), new LinearLayout.LayoutParams((int) (epo.f27511a * 280.0f), (int) (epo.f27511a * 60.0f)));
        dialog.setContentView(linearLayout);
        try {
            dialog.show();
        } catch (Throwable unused) {
        }
    }

    private TextView a(final String str, final BitmapDrawable bitmapDrawable, final Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("354b4054", new Object[]{this, str, bitmapDrawable, dialog});
        }
        TextView textView = new TextView(this.f27245a);
        textView.setText(b.a(R.string.x_detail_app_save));
        textView.setTextSize(1, 22.0f);
        textView.setTextColor(-16777216);
        textView.setGravity(19);
        textView.setPadding(epo.h, 0, 0, 0);
        textView.setBackgroundResource(R.drawable.btn_detail_combtn_click);
        textView.setOnClickListener(new View.OnClickListener() { // from class: tb.eer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                AsyncTask.execute(new Runnable() { // from class: tb.eer.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (f.c(eer.a(eer.this))) {
                            eer.b(eer.this, str, bitmapDrawable);
                        } else {
                            eer.a(eer.this, str, bitmapDrawable);
                        }
                    }
                });
                if (!dialog.isShowing()) {
                    return;
                }
                dialog.dismiss();
            }
        });
        return textView;
    }

    private void c(final String str, final BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("679bc0a9", new Object[]{this, str, bitmapDrawable});
        } else {
            f.a(this.f27245a, this.b, new f.a() { // from class: tb.eer.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.utils.f.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        eer.b(eer.this, str, bitmapDrawable);
                    }
                }
            });
        }
    }

    private void b(String str, BitmapDrawable bitmapDrawable) {
        boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19dc48a8", new Object[]{this, str, bitmapDrawable});
        } else if (bitmapDrawable == null) {
            this.c.sendEmptyMessage(302);
        } else {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap == null) {
                this.c.sendEmptyMessage(302);
                return;
            }
            String str2 = str.hashCode() + ".jpg";
            if (f.c(this.b)) {
                a2 = f.a(this.b, bitmap, str2);
            } else {
                a2 = f.a(this.b, str2, bitmap, (String) null);
            }
            Handler handler = this.c;
            if (handler == null) {
                return;
            }
            if (a2) {
                handler.sendEmptyMessage(301);
            } else {
                handler.sendEmptyMessage(303);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        switch (message.what) {
            case 301:
                epo.a(b.a(R.string.x_detail_app_image_saved_success));
                break;
            case 302:
                epo.a(b.a(R.string.x_detail_app_save_img_error));
                break;
            case 303:
                epo.a(b.a(R.string.x_detail_app_storage_failure));
                break;
        }
        return true;
    }
}
