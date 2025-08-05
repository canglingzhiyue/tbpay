package com.taobao.tao.welcome;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes.dex */
public abstract class d extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f21193a;
    private final int[] b;
    private final int[] c;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(int i);
    }

    static {
        kge.a(-1450970064);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract int a();

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261beb80", new Object[]{dVar});
        } else {
            dVar.e();
        }
    }

    public static /* synthetic */ void a(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d61f783", new Object[]{dVar, new Integer(i)});
        } else {
            dVar.b(i);
        }
    }

    public d(Context context, String str, int[] iArr, int[] iArr2) {
        super(context, R.style.MyDialog);
        if (str == null || iArr2 == null) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length < 2 || (iArr != null && iArr.length != iArr2.length)) {
            throw new IllegalArgumentException();
        }
        this.b = iArr2;
        this.c = iArr;
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(a());
        d();
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setBackgroundDrawable(new ColorDrawable(0));
        }
        b();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.c == null) {
            b((TextView) a(R.id.provision_negative_button), this.b[0]);
            a((TextView) a(R.id.provision_positive_button), this.b[1]);
        } else {
            while (true) {
                int[] iArr = this.c;
                if (i < iArr.length - 1) {
                    b((TextView) a(iArr[i]), this.b[i]);
                    i++;
                } else {
                    a((TextView) a(iArr[iArr.length - 1]), this.b[this.c.length - 1]);
                    return;
                }
            }
        }
    }

    private void a(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7b0fa7", new Object[]{this, textView, new Integer(i)});
            return;
        }
        textView.setVisibility(0);
        textView.setText(i);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.welcome.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    d.a(d.this);
                }
            }
        });
        a(textView);
    }

    private void b(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9163d7e8", new Object[]{this, textView, new Integer(i)});
            return;
        }
        textView.setVisibility(0);
        textView.setText(i);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.welcome.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    d.a(d.this, view.getId());
                }
            }
        });
        a(textView);
    }

    public <T extends View> T a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)}) : (T) findViewById(i);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da403a3", new Object[]{this, aVar});
        } else {
            this.f21193a = aVar;
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a aVar = this.f21193a;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.f21193a;
        if (aVar == null) {
            return;
        }
        aVar.a(i);
    }

    private static void a(final TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92d3edc", new Object[]{textView});
        } else {
            textView.post(new Runnable() { // from class: com.taobao.tao.welcome.d.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
                    int textSize = (int) textView.getTextSize();
                    CharSequence text = textView.getText();
                    Paint paint = new Paint();
                    paint.setTextSize(textSize);
                    float f = width;
                    if (paint.measureText(text, 0, text.length()) <= f) {
                        return;
                    }
                    int i = textSize;
                    int i2 = 0;
                    while (i2 < i) {
                        int i3 = ((i - i2) / 2) + i2;
                        paint.setTextSize(i3);
                        if (i3 != i2 && i3 != i) {
                            if (paint.measureText(text, 0, text.length()) <= f) {
                                if (paint.measureText(text, 0, text.length()) >= f) {
                                    break;
                                }
                                i2 = i3;
                            } else {
                                i = i3;
                            }
                        } else {
                            break;
                        }
                    }
                    textView.setTextSize(0, i2);
                }
            });
        }
    }
}
