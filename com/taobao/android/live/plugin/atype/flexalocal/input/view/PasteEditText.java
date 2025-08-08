package com.taobao.android.live.plugin.atype.flexalocal.input.view;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.taolive.room.ui.chat.view.c;
import com.taobao.taolive.room.utils.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cgl;
import tb.ffg;
import tb.kge;
import tb.phg;
import tb.pmd;
import tb.pnf;

/* loaded from: classes6.dex */
public class PasteEditText extends EditText {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MIN_PASTE_LENGTH = 10;
    private String mClipText;
    private int mEnd;
    public com.taobao.alilive.aliliveframework.frame.a mFrameContext;
    private int mIconHeight;
    private HashMap<String, StickerConfig> mKeyMatchMap;
    private List<a> mMatchList;
    private String mRecentlyPasteText;
    public List<SpannableString> mSpannableContent;
    private int mStart;
    private boolean mbPaste;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f13933a;
        public int b;
        public String c;
        public String d;

        static {
            kge.a(1515853957);
        }
    }

    static {
        kge.a(-672427247);
    }

    public static /* synthetic */ Object ipc$super(PasteEditText pasteEditText, String str, Object... objArr) {
        if (str.hashCode() == -181800469) {
            return new Boolean(super.onTextContextMenuItem(((Number) objArr[0]).intValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$000(PasteEditText pasteEditText) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce3027e8", new Object[]{pasteEditText})).intValue() : pasteEditText.mIconHeight;
    }

    public static /* synthetic */ void access$100(PasteEditText pasteEditText, String str, List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470f75f2", new Object[]{pasteEditText, str, list, new Integer(i)});
        } else {
            pasteEditText.generateStickerByIndex(str, list, i);
        }
    }

    public static /* synthetic */ String access$200(PasteEditText pasteEditText) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8878ad89", new Object[]{pasteEditText}) : pasteEditText.mClipText;
    }

    public static /* synthetic */ boolean access$300(PasteEditText pasteEditText) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f9c29fc", new Object[]{pasteEditText})).booleanValue() : pasteEditText.mbPaste;
    }

    public static /* synthetic */ boolean access$302(PasteEditText pasteEditText, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fd0939e", new Object[]{pasteEditText, new Boolean(z)})).booleanValue();
        }
        pasteEditText.mbPaste = z;
        return z;
    }

    public static /* synthetic */ int access$400(PasteEditText pasteEditText) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("50157fec", new Object[]{pasteEditText})).intValue() : pasteEditText.mStart;
    }

    public static /* synthetic */ int access$402(PasteEditText pasteEditText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e81bddb", new Object[]{pasteEditText, new Integer(i)})).intValue();
        }
        pasteEditText.mStart = i;
        return i;
    }

    public static /* synthetic */ int access$500(PasteEditText pasteEditText) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("308ed5ed", new Object[]{pasteEditText})).intValue() : pasteEditText.mEnd;
    }

    public static /* synthetic */ int access$502(PasteEditText pasteEditText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d3327fa", new Object[]{pasteEditText, new Integer(i)})).intValue();
        }
        pasteEditText.mEnd = i;
        return i;
    }

    public PasteEditText(Context context) {
        super(context);
        this.mbPaste = false;
    }

    public PasteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mbPaste = false;
        init();
    }

    public PasteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mbPaste = false;
        init();
    }

    public PasteEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mbPaste = false;
        init();
    }

    public void setFrameContext(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17230f1a", new Object[]{this, aVar});
            return;
        }
        this.mFrameContext = aVar;
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.mFrameContext;
        if (aVar2 == null || !(aVar2.I() instanceof ffg)) {
            return;
        }
        this.mKeyMatchMap = ((ffg) this.mFrameContext.I()).c();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mIconHeight = d.a(getContext(), 15.0f);
        com.taobao.alilive.aliliveframework.frame.a aVar = this.mFrameContext;
        if (aVar != null && (aVar.I() instanceof ffg)) {
            this.mKeyMatchMap = ((ffg) this.mFrameContext.I()).c();
        }
        setLongClickable(true);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f529f1eb", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 16908322) {
            onTextPaste();
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    private void onTextPaste() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7634e", new Object[]{this});
            return;
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager != null && clipboardManager.getText() != null) {
            String charSequence = clipboardManager.getText().toString();
            if (!StringUtils.isEmpty(charSequence)) {
                generateSticker(charSequence);
                setSelection(getText().length());
            }
            this.mRecentlyPasteText = charSequence;
        }
        if (phg.a() == null) {
            return;
        }
        phg.a().a(this.mFrameContext, "CommentBox_Bubbles", (Map<String, String>) new HashMap());
    }

    public String getRecentlyPasteText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1b529ed7", new Object[]{this}) : this.mRecentlyPasteText;
    }

    public void resetPasteText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cacd15d8", new Object[]{this});
        } else {
            this.mRecentlyPasteText = null;
        }
    }

    private void generateSticker(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bef299", new Object[]{this, str});
            return;
        }
        this.mMatchList = new ArrayList();
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if ('[' == charAt) {
                i2 = i3;
            } else if (']' == charAt && i2 >= 0) {
                int i4 = i3 + 1;
                String substring = str.substring(i2, i4);
                HashMap<String, StickerConfig> hashMap = this.mKeyMatchMap;
                if (hashMap != null && hashMap.containsKey(substring)) {
                    i++;
                    a aVar = new a();
                    aVar.f13933a = i2;
                    aVar.b = i4;
                    aVar.c = substring;
                    aVar.d = this.mKeyMatchMap.get(substring).thumbnail;
                    this.mMatchList.add(aVar);
                }
                i2 = -1;
            }
        }
        if (i > 0) {
            this.mSpannableContent = new ArrayList();
            generateStickerByIndex(str, this.mSpannableContent, 0);
            if (this.mSpannableContent.size() > 0) {
                for (SpannableString spannableString : this.mSpannableContent) {
                    append(spannableString);
                }
                setSelection(getText().length());
                return;
            }
            setText("");
            return;
        }
        append(str);
        setSelection(getText().length());
    }

    private void generateStickerByIndex(final String str, final List<SpannableString> list, final int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1b72ce", new Object[]{this, str, list, new Integer(i)});
        } else if (i >= this.mMatchList.size()) {
            int i3 = i - 1;
            if (this.mMatchList.get(i3).b >= str.length()) {
                return;
            }
            list.add(new SpannableString(str.substring(this.mMatchList.get(i3).b)));
        } else {
            final a aVar = this.mMatchList.get(i);
            if (aVar.f13933a > 0) {
                if (i != 0) {
                    i2 = this.mMatchList.get(i - 1).b;
                }
                list.add(new SpannableString(str.substring(i2, aVar.f13933a)));
            }
            com.alilive.adapter.uikit.d b = cgl.b();
            if (b != null) {
                pmd.a().l().a(b.a(aVar.d)).a(new pnf() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.view.PasteEditText.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.pnf
                    public void a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                            return;
                        }
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                        bitmapDrawable.setBounds(0, 0, (PasteEditText.access$000(PasteEditText.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), PasteEditText.access$000(PasteEditText.this));
                        SpannableString spannableString = new SpannableString(aVar.c);
                        spannableString.setSpan(new c(bitmapDrawable), 0, aVar.c.length(), 17);
                        list.add(spannableString);
                        PasteEditText.access$100(PasteEditText.this, str, list, i + 1);
                    }

                    @Override // tb.pnf
                    public void b(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                            return;
                        }
                        list.add(new SpannableString(aVar.c));
                        PasteEditText.access$100(PasteEditText.this, str, list, i + 1);
                    }
                }).a();
                return;
            }
            list.add(new SpannableString(aVar.c));
            generateStickerByIndex(str, list, i + 1);
        }
    }

    private void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        setLongClickable(false);
        setTextIsSelectable(false);
        setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.view.PasteEditText.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("cb43f5b1", new Object[]{this, actionMode, menuItem})).booleanValue();
                }
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("e072c179", new Object[]{this, actionMode, menu})).booleanValue();
                }
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode actionMode) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a57b0823", new Object[]{this, actionMode});
                }
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("cae505a6", new Object[]{this, actionMode, menu})).booleanValue();
                }
                return false;
            }
        });
        addTextChangedListener(new TextWatcher() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.view.PasteEditText.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                int i4 = i3 + i;
                if (!charSequence.subSequence(i, i4).toString().equals(PasteEditText.access$200(PasteEditText.this))) {
                    return;
                }
                PasteEditText.access$302(PasteEditText.this, true);
                PasteEditText.access$402(PasteEditText.this, i);
                PasteEditText.access$502(PasteEditText.this, i4);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                } else if (!PasteEditText.access$300(PasteEditText.this)) {
                } else {
                    PasteEditText.access$302(PasteEditText.this, false);
                    editable.delete(PasteEditText.access$400(PasteEditText.this), PasteEditText.access$500(PasteEditText.this));
                }
            }
        });
    }

    public void onResume() {
        ClipData.Item itemAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        try {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null || itemAt.getText() == null) {
                return;
            }
            this.mClipText = itemAt.getText().toString();
            if (this.mClipText.length() >= 10) {
                return;
            }
            this.mClipText = "";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
