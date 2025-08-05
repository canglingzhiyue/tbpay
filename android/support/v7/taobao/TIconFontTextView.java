package android.support.v7.taobao;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.taobao.taobao.R;
import tb.kge;

@Deprecated
/* loaded from: classes2.dex */
public class TIconFontTextView extends TextView {
    private static Typeface sIconfont;
    private static int sReference;

    static {
        kge.a(257684923);
        sReference = 0;
    }

    public TIconFontTextView(Context context) {
        this(context, null, 0);
    }

    public TIconFontTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TIconFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        setTextSize(1, 24.0f);
        setTextColor(getResources().getColor(R.color.appcompat_default_icon));
        setIncludeFontPadding(false);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (sIconfont == null) {
            try {
                sIconfont = Typeface.createFromAsset(getContext().getAssets(), "uik_iconfont.ttf");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        setTypeface(sIconfont);
        sReference++;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        setTypeface(null);
        sReference--;
        if (sReference == 0) {
            sIconfont = null;
        }
        super.onDetachedFromWindow();
    }
}
