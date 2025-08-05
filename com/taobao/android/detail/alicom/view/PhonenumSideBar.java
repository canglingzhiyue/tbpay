package com.taobao.android.detail.alicom.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.b;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class PhonenumSideBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int choose;
    public int height;
    private List<String> letterList;
    private TextView mTextDialog;
    private a onTouchingLetterChangedListener;
    private Paint paint;
    public int singleHeight;
    public int textSize;
    public int width;

    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);
    }

    static {
        kge.a(2107128315);
    }

    public static /* synthetic */ Object ipc$super(PhonenumSideBar phonenumSideBar, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PhonenumSideBar(Context context) {
        this(context, null);
    }

    public PhonenumSideBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhonenumSideBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.choose = -1;
        this.paint = new Paint();
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            setBackgroundColor(b.a("#F5F5F5"));
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        this.height = getHeight();
        this.width = getWidth();
        int i = this.width;
        this.textSize = (i / 3) << 1;
        this.singleHeight = i;
        this.paint.setColor(b.a("#007AFF"));
        this.paint.setAntiAlias(true);
        this.paint.setTextSize(this.textSize);
        List<String> list = this.letterList;
        if (list == null || list.size() == 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        for (int i2 = 0; i2 < this.letterList.size(); i2++) {
            float measureText = (this.width / 2) - (this.paint.measureText(this.letterList.get(i2)) / 2.0f);
            int i3 = this.singleHeight;
            canvas.drawText(this.letterList.get(i2), measureText, (this.height / 2) + ((i2 - (this.letterList.size() / 2)) * i3) + ((i3 + this.textSize) / 2), this.paint);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int size;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        int i = this.choose;
        a aVar = this.onTouchingLetterChangedListener;
        if (y <= (this.height - (this.letterList.size() * this.singleHeight)) / 2) {
            size = 0;
        } else {
            int i2 = this.height;
            int size2 = this.letterList.size();
            int i3 = this.singleHeight;
            size = y >= ((float) ((i2 + (size2 * i3)) / 2)) ? this.letterList.size() - 1 : (int) ((y - ((this.height - (i3 * this.letterList.size())) / 2)) / this.singleHeight);
        }
        if (action == 1) {
            this.choose = -1;
            invalidate();
            TextView textView = this.mTextDialog;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else if (i != size && (list = this.letterList) != null && size >= 0 && size < list.size()) {
            if (aVar != null && size < this.letterList.size() && size >= 0) {
                aVar.a(this.letterList.get(size));
            }
            TextView textView2 = this.mTextDialog;
            if (textView2 != null) {
                textView2.setText(this.letterList.get(size));
                this.mTextDialog.setVisibility(0);
            }
            this.choose = size;
            invalidate();
        }
        return true;
    }

    public void setIndexText(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd8a6dd5", new Object[]{this, list});
            return;
        }
        this.letterList = list;
        invalidate();
    }

    public void setTextView(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db637829", new Object[]{this, textView});
        } else {
            this.mTextDialog = textView;
        }
    }

    public void setOnTouchingLetterChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c474844", new Object[]{this, aVar});
        } else {
            this.onTouchingLetterChangedListener = aVar;
        }
    }
}
