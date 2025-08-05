package tb;

import android.animation.Animator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class obv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RenderScript f31901a;
    private ViewGroup b;
    private View c;

    static {
        kge.a(-1967475040);
    }

    public static /* synthetic */ View a(obv obvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("5dc523f7", new Object[]{obvVar}) : obvVar.c;
    }

    public static TextureView a(ViewGroup viewGroup) {
        TextureView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("d7ce0388", new Object[]{viewGroup});
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (a2 = a((ViewGroup) childAt)) != null) {
                return a2;
            }
        }
        return null;
    }

    public static Bitmap a(int i, RenderScript renderScript, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9a37d235", new Object[]{new Integer(i), renderScript, bitmap});
        }
        Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap);
        Allocation createTyped = Allocation.createTyped(renderScript, createFromBitmap.getType());
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        create.setRadius(i);
        create.setInput(createFromBitmap);
        create.forEach(createTyped);
        createTyped.copyTo(bitmap);
        return bitmap;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view == null) {
            return;
        }
        ocf.a(view.getBackground(), new Animator.AnimatorListener() { // from class: tb.obv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    obv.a(obv.this).setBackgroundColor(0);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    obv.a(obv.this).setBackgroundColor(0);
                }
            }
        });
    }

    public void a(qmq qmqVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c3630f", new Object[]{this, qmqVar, view});
        } else if (Build.VERSION.SDK_INT < 17) {
            b(qmqVar, view);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            TextureView a2 = a((ViewGroup) view);
            if (a2 == null) {
                b(qmqVar, view);
                return;
            }
            if (this.b == null) {
                this.b = (ViewGroup) ((Activity) view.getContext()).findViewById(R.id.multi_tab_layout);
            }
            int width = (int) (this.b.getWidth() / 10.0f);
            int height = (int) (this.b.getHeight() / 10.0f);
            String str = " cW=" + width + " cH=" + height + " vW:" + ((int) (a2.getWidth() / 10.0f)) + " vH:" + ((int) (a2.getHeight() / 10.0f));
            RectF a3 = ocf.a((View) a2, this.b);
            Bitmap bitmap = a2.getBitmap((int) (a3.width() / 10.0f), (int) (a3.height() / 10.0f));
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(-16777216);
            canvas.drawBitmap(bitmap, a3.left / 10.0f, a3.top / 10.0f, (Paint) null);
            long currentTimeMillis2 = System.currentTimeMillis();
            if (this.f31901a == null) {
                this.f31901a = RenderScript.create(view.getContext());
            }
            Bitmap a4 = a(10, this.f31901a, createBitmap);
            long currentTimeMillis3 = System.currentTimeMillis();
            r0 = "cacheTime=" + (currentTimeMillis2 - currentTimeMillis) + " blurTime=" + (currentTimeMillis3 - currentTimeMillis2);
            this.c = qmqVar.b();
            if (this.c == null) {
                return;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(a4);
            ocf.a(bitmapDrawable);
            this.c.setBackground(bitmapDrawable);
        }
    }

    private void b(qmq qmqVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef3a2ee", new Object[]{this, qmqVar, view});
            return;
        }
        this.c = qmqVar.b();
        View view2 = this.c;
        if (view2 == null) {
            return;
        }
        view2.setBackgroundColor(-1442840576);
    }
}
