package android.support.constraint.motion;

import android.content.Context;
import android.support.constraint.ConstraintAttribute;
import android.support.constraint.ConstraintLayout;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class h {
    public static final int UNSET = -1;

    /* renamed from: a  reason: collision with root package name */
    static HashMap<String, Constructor<? extends c>> f1085a = new HashMap<>();
    private HashMap<Integer, ArrayList<c>> b = new HashMap<>();

    static {
        try {
            f1085a.put("KeyAttribute", d.class.getConstructor(new Class[0]));
            f1085a.put("KeyPosition", i.class.getConstructor(new Class[0]));
            f1085a.put("KeyCycle", f.class.getConstructor(new Class[0]));
            f1085a.put("KeyTimeCycle", k.class.getConstructor(new Class[0]));
            f1085a.put("KeyTrigger", l.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public h(Context context, XmlPullParser xmlPullParser) {
        c cVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        if (f1085a.containsKey(name)) {
                            try {
                                c newInstance = f1085a.get(name).newInstance(new Object[0]);
                                try {
                                    newInstance.a(context, Xml.asAttributeSet(xmlPullParser));
                                    a(newInstance);
                                    cVar = newInstance;
                                } catch (Exception e) {
                                    e = e;
                                    cVar = newInstance;
                                    Log.e("KeyFrames", "unable to create ", e);
                                    eventType = xmlPullParser.next();
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } else if (name.equalsIgnoreCase("CustomAttribute") && cVar != null && cVar.f != null) {
                            ConstraintAttribute.a(context, xmlPullParser, cVar.f);
                        }
                    } else if (eventType == 3) {
                        if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                            return;
                        }
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }

    private void a(c cVar) {
        if (!this.b.containsKey(Integer.valueOf(cVar.c))) {
            this.b.put(Integer.valueOf(cVar.c), new ArrayList<>());
        }
        this.b.get(Integer.valueOf(cVar.c)).add(cVar);
    }

    public void a(n nVar) {
        ArrayList<c> arrayList = this.b.get(Integer.valueOf(nVar.b));
        if (arrayList != null) {
            nVar.a(arrayList);
        }
        ArrayList<c> arrayList2 = this.b.get(-1);
        if (arrayList2 != null) {
            Iterator<c> it = arrayList2.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.a(((ConstraintLayout.LayoutParams) nVar.f1090a.getLayoutParams()).aA)) {
                    nVar.a(next);
                }
            }
        }
    }
}
