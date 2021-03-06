package com.ctech.messenger.repository

import android.content.Context
import com.ctech.livemessage.onboarding.model.User
import com.ctech.messenger.R
import com.ctech.messenger.model.Message
import com.ctech.messenger.model.MessageType
import com.ctech.messenger.utils.ResourcesUtils.getUri
import io.reactivex.Observable

class MessageRepository(private val context: Context) {

    private val loggedUser = User(2, getUri(context, R.drawable.ic_avatar_user2))
    private val friend = User(1, getUri(context, R.drawable.ic_avatar_user1))

    fun getLoggedUser(): User {
        return loggedUser
    }

    fun getMessages(page: Int): Observable<List<Message>> {
        return Observable.just(getMessagesList(page))
    }

    private fun getMessagesList(page: Int): List<Message> {
        return listOf(
                Message(0, loggedUser, "Hey Ann Vu", null, MessageType.TEXT, "12: 35 PM"),
                Message(1, loggedUser, "How's Vietnam?", null, MessageType.TEXT, "12: 35 PM"),
                Message(2, friend, "", getUri(context, R.drawable.ic_user1_message), MessageType.IMAGE, "12: 35 PM"),
                Message(3, loggedUser, "OMG you look so great! \uD83D\uDE0D \uD83D\uDE18", null,
                        MessageType.TEXT, "12:36 PM"),
                Message(4, friend, "Amazing! But it’s sooo hot here. \uD83D\uDE06 \uD83D\uDE31",
                        null, MessageType.TEXT, "12: 36 PM"),
                Message(5, loggedUser, "you need a hat, lol \uD83D\uDC52 \uD83D\uDE18!", null,
                        MessageType.TEXT, "12: 38 PM"),
                Message(6, loggedUser, "we miss you so bad :(", null,
                        MessageType.TEXT, "12: 39 PM")
        )

    }

}