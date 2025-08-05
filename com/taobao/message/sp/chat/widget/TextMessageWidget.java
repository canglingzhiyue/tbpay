package com.taobao.message.sp.chat.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.provider.IElderFontProvider;
import com.taobao.message.kit.util.PatternsUtil;
import com.taobao.message.kit.util.Span;
import com.taobao.message.kit.util.TraceUtil;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.uikit.media.expression.ExpressionTable;
import com.taobao.message.uikit.text.style.LongClickLinkMovementMethod;
import com.taobao.message.uikit.text.style.LongClickableSpan;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.message.uikit.view.PatchedTextView;
import com.taobao.taobao.R;
import com.taobao.unit.center.mdc.dinamicx.widget.DXMsgTextViewWidgetNode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import tb.kge;

/* loaded from: classes7.dex */
public class TextMessageWidget extends WidgetInstance<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context context;
    private FrameLayout itemView;
    private TextView textView;
    private Set<LongClickableSpan> phoneNumSpans = new HashSet();
    private Set<LongClickableSpan> urlSpans = new HashSet();
    private Map<String, CharSequence> spans = new HashMap();

    static {
        kge.a(-1351643981);
    }

    public static /* synthetic */ Object ipc$super(TextMessageWidget textMessageWidget, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(Context context, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        this.textView = createTextMessageView(context);
        this.context = context;
        this.textView.setMaxWidth((int) (((DisplayUtil.getMaxWindowWidth(context) * 1.0f) / 750.0f) * 538.0f));
        IElderFontProvider iElderFontProvider = (IElderFontProvider) GlobalContainer.getInstance().get(IElderFontProvider.class);
        if (iElderFontProvider != null && iElderFontProvider.isElderFont()) {
            z = true;
        }
        if (z) {
            this.textView.setTextSize(1, 24.0f);
        } else {
            this.textView.setTextSize(1, 16.0f);
        }
        return this.itemView;
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public void bindData(JSONObject jSONObject, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b185178e", new Object[]{this, jSONObject, eventDispatcher});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getJSONObject("props").getString("userId");
            JSONObject jSONObject2 = jSONObject.getJSONObject("message").getJSONObject("sender");
            if (!TextUtils.equals(string, jSONObject2.getString("targetId")) || !TextUtils.equals("3", jSONObject2.getString("type"))) {
                this.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            } else {
                this.itemView.setBackgroundColor(Color.parseColor("#FFF8EB"));
            }
            if (jSONObject.getBooleanValue("canQuote") || jSONObject.getBooleanValue("enableQuote")) {
                if (DisplayUtil.isLargeScreen(this.context)) {
                    this.textView.getLayoutParams().width = DisplayUtil.ap2DesignScalePx(this.context, 269.0f);
                } else {
                    this.textView.getLayoutParams().width = (int) (((this.context.getResources().getDisplayMetrics().widthPixels * 1.0f) / 750.0f) * 538.0f);
                }
            } else {
                this.textView.getLayoutParams().width = -2;
            }
            String string2 = jSONObject.getString("text");
            String trim = TextUtils.isEmpty(string2) ? "" : string2.trim();
            this.textView.setContentDescription(ExpressionTable.convertExpression(string2));
            if (this.spans.containsKey(trim)) {
                this.textView.setText(this.spans.get(trim));
            } else {
                TraceUtil.asyncTraceBegin("TextMessageWidget", "handleTextSpan", 101);
                SpannableString expressionStringWithCache = ExpressionTable.getExpressionStringWithCache(this.context, trim);
                disposePhoneNum(expressionStringWithCache, eventDispatcher);
                disposeUrl(expressionStringWithCache, eventDispatcher);
                disposeEmail(expressionStringWithCache, eventDispatcher);
                this.spans.put(trim, expressionStringWithCache);
                this.textView.setText(expressionStringWithCache);
                TraceUtil.asyncTraceEnd("TextMessageWidget", "handleTextSpan", 101);
            }
            if (!(this.textView.getMovementMethod() instanceof LongClickLinkMovementMethod)) {
                this.textView.setMovementMethod(LongClickLinkMovementMethod.getInstance());
            }
            this.textView.setFocusable(false);
            this.textView.setClickable(false);
            this.textView.setLongClickable(false);
        }
    }

    private void disposeUrl(SpannableString spannableString, final EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a716e845", new Object[]{this, spannableString, eventDispatcher});
            return;
        }
        Matcher matcher = PatternsUtil.getWebUrlPattern().matcher(spannableString.toString());
        while (matcher.find()) {
            final String group = matcher.group();
            if (!TextUtils.isEmpty(group) && !TextUtils.isEmpty(group)) {
                LongClickableSpan longClickableSpan = new LongClickableSpan() { // from class: com.taobao.message.sp.chat.widget.TextMessageWidget.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.uikit.text.style.LongClickableSpan
                    public void onDoubleClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("bcd83113", new Object[]{this, view});
                        }
                    }

                    @Override // com.taobao.message.uikit.text.style.LongClickableSpan
                    public void onLongClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7edba0fe", new Object[]{this, view});
                        }
                    }

                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("content", group);
                        hashMap.put("type", 1);
                        eventDispatcher.dispatch(new Event.Build("click").data(hashMap).build());
                    }
                };
                clearPhoneNumSpan(spannableString, matcher.start(), matcher.end());
                longClickableSpan.setStart(matcher.start());
                longClickableSpan.setEnd(matcher.end());
                this.urlSpans.add(longClickableSpan);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#3d7fff"));
                spannableString.setSpan(longClickableSpan, matcher.start(), matcher.end(), 17);
                spannableString.setSpan(foregroundColorSpan, matcher.start(), matcher.end(), 17);
            }
        }
    }

    private void disposeEmail(SpannableString spannableString, final EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec6d272", new Object[]{this, spannableString, eventDispatcher});
            return;
        }
        Matcher matcher = PatternsUtil.getEmailPattern().matcher(spannableString.toString());
        while (matcher.find()) {
            final String group = matcher.group();
            if (!TextUtils.isEmpty(group)) {
                LongClickableSpan longClickableSpan = new LongClickableSpan() { // from class: com.taobao.message.sp.chat.widget.TextMessageWidget.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.uikit.text.style.LongClickableSpan
                    public void onDoubleClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("bcd83113", new Object[]{this, view});
                        }
                    }

                    @Override // com.taobao.message.uikit.text.style.LongClickableSpan
                    public void onLongClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7edba0fe", new Object[]{this, view});
                        }
                    }

                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("content", group);
                        hashMap.put("type", 2);
                        eventDispatcher.dispatch(new Event.Build("click").data(hashMap).build());
                    }
                };
                clearPhoneNumSpan(spannableString, matcher.start(), matcher.end());
                clearUrlSpan(spannableString, matcher.start(), matcher.end());
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#3d7fff"));
                spannableString.setSpan(longClickableSpan, matcher.start(), matcher.end(), 17);
                spannableString.setSpan(foregroundColorSpan, matcher.start(), matcher.end(), 17);
            }
        }
    }

    private void disposePhoneNum(SpannableString spannableString, final EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d703cac", new Object[]{this, spannableString, eventDispatcher});
            return;
        }
        this.phoneNumSpans.clear();
        for (Span span : DXMsgTextViewWidgetNode.findPhonesSpans(spannableString.toString())) {
            final String str = span.getStr();
            LongClickableSpan longClickableSpan = new LongClickableSpan() { // from class: com.taobao.message.sp.chat.widget.TextMessageWidget.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.uikit.text.style.LongClickableSpan
                public void onDoubleClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bcd83113", new Object[]{this, view});
                    }
                }

                @Override // com.taobao.message.uikit.text.style.LongClickableSpan
                public void onLongClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7edba0fe", new Object[]{this, view});
                    }
                }

                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("content", str);
                    hashMap.put("type", 0);
                    eventDispatcher.dispatch(new Event.Build("click").data(hashMap).build());
                }
            };
            longClickableSpan.setStart(span.getStart());
            longClickableSpan.setEnd(span.getEnd());
            this.phoneNumSpans.add(longClickableSpan);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#3d7fff"));
            spannableString.setSpan(longClickableSpan, span.getStart(), span.getEnd(), 17);
            spannableString.setSpan(foregroundColorSpan, span.getStart(), span.getEnd(), 17);
        }
    }

    private void clearPhoneNumSpan(SpannableString spannableString, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69949b8", new Object[]{this, spannableString, new Integer(i), new Integer(i2)});
            return;
        }
        for (LongClickableSpan longClickableSpan : this.phoneNumSpans) {
            if (longClickableSpan != null && longClickableSpan.getStart() >= i && longClickableSpan.getEnd() <= i2) {
                spannableString.removeSpan(longClickableSpan);
            }
        }
    }

    private void clearUrlSpan(SpannableString spannableString, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2d0bf5", new Object[]{this, spannableString, new Integer(i), new Integer(i2)});
            return;
        }
        for (LongClickableSpan longClickableSpan : this.urlSpans) {
            if (longClickableSpan != null && longClickableSpan.getStart() >= i && longClickableSpan.getEnd() <= i2) {
                spannableString.removeSpan(longClickableSpan);
            }
        }
    }

    private TextView createTextMessageView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("17224f32", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.itemView = frameLayout;
        PatchedTextView patchedTextView = new PatchedTextView(context);
        patchedTextView.setId(R.id.tv_chat_text_local);
        patchedTextView.setBackground(null);
        patchedTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        patchedTextView.setLinksClickable(true);
        patchedTextView.setMinHeight(DisplayUtil.dip2px(40.0f));
        patchedTextView.setPadding(DisplayUtil.dip2px(12.0f), DisplayUtil.dip2px(10.0f), DisplayUtil.dip2px(12.0f), DisplayUtil.dip2px(10.0f));
        patchedTextView.setTextColor(Color.parseColor("#333333"));
        patchedTextView.setLinkTextColor(Color.parseColor("#ff007aff"));
        patchedTextView.setTextIsSelectable(true);
        this.itemView.addView(patchedTextView);
        return patchedTextView;
    }
}
