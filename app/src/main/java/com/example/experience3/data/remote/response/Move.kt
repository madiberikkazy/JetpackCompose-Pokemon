package com.example.experience3.data.remote.response

data class Move(
    val move: com.example.experience3.data.remote.response.MoveX,
    val version_group_details: List<com.example.experience3.data.remote.response.VersionGroupDetail>
)