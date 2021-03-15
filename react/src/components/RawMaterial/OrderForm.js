import React, {useEffect, useState} from 'react';
import {
    Dialog,
    DialogTitle,
    DialogContent,
    makeStyles,
    DialogContentText,
    DialogActions,
    FormControl, InputLabel, Select, MenuList, Menu, MenuItem, Box, Input
} from '@material-ui/core';
import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';
import request from 'superagent';
import BuildPath from '../RequestBuilder'
import {Grid} from "@material-ui/core";



const useStyles = makeStyles(theme => ({

    dialogWrapper: {
        width: '75%'
    },
    dialogAction: {
        justifyContent: 'flex-start'
    },
    leftDialogActions: {
        justifyContent: 'flex-start'
    },
}))

const OrderForm = (props) =>{

    const {setQuantity, setDateTime,orderData} = props;
    
    const classes = useStyles();
    
    return (
        <>
        <Grid>
                <TextField
                disabled
                id="outlined-disabled"
                margin="dense"
                label="Name "
                defaultValue={orderData['name']}
                variant="outlined"
                fullWidth
                />
                <TextField
                disabled
                margin="dense"
                id="outlined-disabled"
                label="Vendor Name"
                defaultValue={orderData['companyname']}
                variant="outlined"
                fullWidth
                />
                <TextField
                autoFocus
                margin="dense"
                // defaultValue={rowData['name']}
                type="number"
                onChange = {e => setQuantity(e.target.value)}
                label={`Quantity ${orderData['unit']}`}
                fullWidth
                variant="outlined"
                />
                <TextField
                id="datetime-local"
                label="Schedule Delivery"
                type="datetime-local"
                InputLabelProps={{
                shrink: true,
            }}
                onChange={e => setDateTime(e.target.value)}
                />
        </Grid>
        </>
    )
};
export {OrderForm};