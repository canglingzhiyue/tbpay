package com.taobao.taolive.adapterimpl.uikit;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.alilive.adapter.uikit.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.effects.RoundedCornersBitmapProcessor;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes8.dex */
public class TaoliveUrlImageView extends TUrlImageView implements AliUrlImageView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private c mIImageLoadListener;
    private int mLoopCount;

    static {
        kge.a(-1442003586);
        kge.a(-75483781);
    }

    public static /* synthetic */ Object ipc$super(TaoliveUrlImageView taoliveUrlImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1825981728) {
            if (hashCode == 101738488) {
                super.setPhenixOptions((PhenixOptions) objArr[0]);
                return null;
            } else if (hashCode != 289493764) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return super.succListener((com.taobao.phenix.intf.event.a) objArr[0]);
            }
        }
        return super.failListener((com.taobao.phenix.intf.event.a) objArr[0]);
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void initAttr(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15121a6e", new Object[]{this, context, attributeSet});
        }
    }

    public static /* synthetic */ int access$000(TaoliveUrlImageView taoliveUrlImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bc1ebe5b", new Object[]{taoliveUrlImageView})).intValue() : taoliveUrlImageView.mLoopCount;
    }

    public static /* synthetic */ c access$100(TaoliveUrlImageView taoliveUrlImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ffe6fef7", new Object[]{taoliveUrlImageView}) : taoliveUrlImageView.mIImageLoadListener;
    }

    public TaoliveUrlImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.taolive.adapterimpl.uikit.TaoliveUrlImageView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                if (TaoliveUrlImageView.access$000(TaoliveUrlImageView.this) > 0) {
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    if (drawable instanceof com.taobao.phenix.animate.b) {
                        ((com.taobao.phenix.animate.b) drawable).a(TaoliveUrlImageView.access$000(TaoliveUrlImageView.this));
                    }
                }
                if (TaoliveUrlImageView.access$100(TaoliveUrlImageView.this) != null && succPhenixEvent != null) {
                    TaoliveUrlImageView.access$100(TaoliveUrlImageView.this).a(succPhenixEvent.getDrawable());
                }
                return false;
            }
        });
        super.failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.taolive.adapterimpl.uikit.TaoliveUrlImageView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
            }

            public boolean a(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                if (TaoliveUrlImageView.access$100(TaoliveUrlImageView.this) != null) {
                    TaoliveUrlImageView.access$100(TaoliveUrlImageView.this).a();
                }
                return false;
            }
        });
    }

    public TaoliveUrlImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TaoliveUrlImageView(Context context) {
        this(context, null);
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void setLoadListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d43db4fb", new Object[]{this, cVar});
        } else {
            this.mIImageLoadListener = cVar;
        }
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void setCircleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bda86a9e", new Object[]{this});
        } else {
            super.setPhenixOptions(new PhenixOptions().bitmapProcessors(new com.taobao.phenix.compat.effects.c()));
        }
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void setCropCircleView(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5b0c11", new Object[]{this, new Float(f), new Integer(i)});
        } else {
            super.setPhenixOptions(new PhenixOptions().bitmapProcessors(new com.taobao.phenix.compat.effects.c(f, i)));
        }
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void setRoundeCornerView(int i, int i2, int i3, int i4, int i5) {
        RoundedCornersBitmapProcessor.CornerType cornerType;
        RoundedCornersBitmapProcessor.CornerType cornerType2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd52869", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        RoundedCornersBitmapProcessor.CornerType cornerType3 = RoundedCornersBitmapProcessor.CornerType.ALL;
        if (i5 == 0) {
            cornerType2 = RoundedCornersBitmapProcessor.CornerType.ALL;
        } else if (i5 == 1) {
            cornerType2 = RoundedCornersBitmapProcessor.CornerType.TOP;
        } else if (i5 == 2) {
            cornerType2 = RoundedCornersBitmapProcessor.CornerType.BOTTOM;
        } else if (i5 == 3) {
            cornerType2 = RoundedCornersBitmapProcessor.CornerType.LEFT;
        } else if (i5 != 4) {
            cornerType = cornerType3;
            super.setPhenixOptions(new PhenixOptions().bitmapProcessors(new RoundedCornersBitmapProcessor(i, i2, i3, i4, cornerType)));
        } else {
            cornerType2 = RoundedCornersBitmapProcessor.CornerType.RIGHT;
        }
        cornerType = cornerType2;
        super.setPhenixOptions(new PhenixOptions().bitmapProcessors(new RoundedCornersBitmapProcessor(i, i2, i3, i4, cornerType)));
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void setBlur(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e71dc38", new Object[]{this, context, new Integer(i), new Integer(i2)});
        } else {
            super.setPhenixOptions(new PhenixOptions().bitmapProcessors(new com.taobao.phenix.compat.effects.b(context, i, i2)));
        }
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void setMaxLoopCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4742ebb3", new Object[]{this, new Integer(i)});
        } else {
            this.mLoopCount = i;
        }
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void setPlaceHolder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffa0e2b", new Object[]{this, new Integer(i)});
        } else {
            setPlaceHoldImageResId(i);
        }
    }

    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
        } else {
            setLoadListener(null);
        }
    }
}
