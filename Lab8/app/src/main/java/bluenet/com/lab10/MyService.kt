package bluenet.com.lab10

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder

class MyService : Service() {
    override fun onCreate() {
        super.onCreate()
        Handler().postDelayed({
            val intent = Intent(this@MyService, Main2Activity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            this@MyService.startActivity(intent)
        }, 5000)}
    override fun onStartCommand(intent: Intent, flags: Int, startid: Int): Int {
        super.onStartCommand(intent, flags, startid)
        return START_NOT_STICKY}
    override fun onBind(intent: Intent): IBinder? {
        return null }}
