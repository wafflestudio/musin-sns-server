package com.wafflestudio.msns.domain.playlist.dto

import com.wafflestudio.msns.domain.playlist.model.Playlist
import java.util.UUID

class PlaylistResponse {
    data class DetailResponse(
        val id: Long,
        val streamId: UUID,
        val thumbnail: String
    ) {
        constructor(playlist: Playlist) : this(
            id = playlist.id,
            streamId = playlist.streamId,
            thumbnail = playlist.thumbnail
        )
    }

    data class APIResponse(
        val message: String,
        val playlist: DetailResponse
    )
}
